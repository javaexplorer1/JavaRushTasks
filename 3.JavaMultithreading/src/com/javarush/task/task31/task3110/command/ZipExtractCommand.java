package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Распаковка архива");
            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите путь для распаковки:");
            String string = ConsoleHelper.readString();
            Path path = Paths.get(string);
            zipFileManager.extractAll(path);
            ConsoleHelper.writeMessage("Архив распакован.");
        } catch (WrongZipFileException e) {
            ConsoleHelper.writeMessage("Неправильно указан путь");
        }
    }
}
