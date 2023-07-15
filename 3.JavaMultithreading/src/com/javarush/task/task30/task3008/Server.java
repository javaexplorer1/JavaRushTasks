package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
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

        Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            connection.send(new Message(MessageType.NAME_REQUEST, "Введите ваше имя"));
            Message message = connection.receive();
            String userName = message.getData();
            if (message.getType() == MessageType.USER_NAME &&
                    userName != null &&
                    userName != "" &&
                    !connectionMap.containsKey(userName)) {
                connectionMap.put(userName, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED, "Добро пожаловать в чат!"));
                return userName;
            } else {
                ConsoleHelper.writeMessage("Ошибка ввода имени пользователя");
                return serverHandshake(connection);
            }

        }
    }
}
