package com.javarush.task.pro.task15.task1506;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();
        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);
        for (String str : lines) {
            System.out.println(str.replaceAll("[., ]", ""));
        }
    }
}

