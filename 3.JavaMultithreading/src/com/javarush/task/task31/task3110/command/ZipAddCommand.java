package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Добавление нового файла в архив");
            ZipFileManager zipFileManager = getZipFileManager();
            ConsoleHelper.writeMessage("Введите путь к файлу, который нужно добавить в архив");
            String string = ConsoleHelper.readString();
            zipFileManager.addFile(Paths.get(string));
            ConsoleHelper.writeMessage("Добавление в архив завершено");
        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Файл не добавлен");
        }
    }
}
