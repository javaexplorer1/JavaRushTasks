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

    }
}
