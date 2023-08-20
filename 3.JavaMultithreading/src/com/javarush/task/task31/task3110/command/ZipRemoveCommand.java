package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Удаление файла из архива");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Введите путь к файлу в архиве");
        String string = ConsoleHelper.readString();
        zipFileManager.removeFile(Paths.get(string));
        ConsoleHelper.writeMessage("Удаление файла из архива завершено");
    }
}
