package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.*;

import java.io.IOException;

public class Client {

    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Введите адрес сервера");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите порт сервера");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("Введите имя пользователя");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Не удалось отправить сообщение");
            clientConnected = false;
        }
    }

    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        try {
            synchronized (this) {
                this.wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
            return;
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено.\n" +
                    "Для выхода наберите команду 'exit'.");
            while (clientConnected) {
                String string = ConsoleHelper.readString();
                if (string.equalsIgnoreCase("exit")) {
                    break;
                } else {
                   if (shouldSendTextFromConsole()) {
                       sendTextMessage(string);
                   }
                }
            }
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread {

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("Участник с именем " + userName + "присоединился к чату");
        }
        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("Участник с именем " + userName + "покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

    }
}
