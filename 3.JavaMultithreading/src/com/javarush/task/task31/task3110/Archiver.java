package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.IOException;

public class Archiver {

    public static Operation askOperation() throws IOException {

        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage("0 - упаковать файлы в архив");
        ConsoleHelper.writeMessage("1 - добавить файл в архив");
        ConsoleHelper.writeMessage("2 - удалить файл из архива");
        ConsoleHelper.writeMessage("3 - распаковать архив");
        ConsoleHelper.writeMessage("4 - просмотреть содержимое архива");
        ConsoleHelper.writeMessage("5 - выход");

        int number = ConsoleHelper.readInt();
        Operation[] values = Operation.values();
        return values[number];
    }

    public static void main(String[] args) throws Exception {

        Operation operation = null;

        while (operation != Operation.EXIT) {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception exception) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        }


    }
}
