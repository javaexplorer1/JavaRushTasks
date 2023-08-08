package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите полный путь к архиву");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ZipFileManager fileManager = new ZipFileManager(Paths.get(string));

        System.out.println("Введите полный путь к файлу, который нужно архивировать");
        String stringArch = reader.readLine();

        fileManager.createZip(Paths.get(stringArch));

    }
}
