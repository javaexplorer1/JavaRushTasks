package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Objects;

public class BotClient extends Client {
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String[] strings = message.split(":");
                String name = strings[0];
                String text = strings[1].trim();
                String format = null;
                if (text.equals("дата")) {
                    format = "d.MM.YYYY";
                } else if (text.equals("день")) {
                    format = "d";
                } else if (text.equals("месяц")) {
                    format = "MMMM";
                } else if (text.equals("год")) {
                    format = "YYYY";
                } else if (text.equals("время")) {
                    format = "H:mm:ss";
                } else if (text.equals("час")) {
                    format = "H";
                } else if (text.equals("минуты")) {
                    format = "m";
                } else if (text.equals("секунды")) {
                    format = "s";
                }
                if (Objects.nonNull(format)) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                    String formatted = simpleDateFormat.format(new GregorianCalendar().getTime());
                    sendTextMessage("Информация для " + name + ": " + formatted);
                }
            }

        }
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }
}
