package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.exists(fileNewPath)) {
            Files.delete(filePath);
        } else {
            Files.move(filePath, fileNewPath);
        }
    }
}

