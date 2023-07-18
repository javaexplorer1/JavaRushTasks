package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        Collection<Connection> connections = connectionMap.values();
        for (Connection connection : connections) {
            try {
                connection.send(message);

            } catch (IOException e) {
                ConsoleHelper.writeMessage("Сообщение не отправлено");
            }
        }
    }

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Ошибка при старте или работе сервера");
        }

    }

    private static class Handler extends Thread {

        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            connection.send(new Message(MessageType.NAME_REQUEST, "Введите ваше имя"));
            Message message = connection.receive();
            String userName = message.getData();
            if (message.getType() == MessageType.USER_NAME &&
                    Objects.nonNull(userName) &&
                    !userName.isEmpty() &&
                    !connectionMap.containsKey(userName)) {
                connectionMap.put(userName, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED, "Добро пожаловать в чат!"));
                return userName;
            } else {
                ConsoleHelper.writeMessage("Ошибка ввода имени пользователя");
                return serverHandshake(connection);
            }

        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            Set<String> names = connectionMap.keySet();
            for (String name : names) {
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();

                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT,
                            userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Сообщение не является текстом");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено соединение с удаленным адресом"
                    + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом");
            }
            if (Objects.nonNull(userName)) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }
            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");
        }
    }
}
