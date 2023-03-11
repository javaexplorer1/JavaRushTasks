package com.javarush.task.task18.task1808;


import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream file1 = new FileInputStream(scanner.nextLine());
            FileOutputStream file2 = new FileOutputStream(scanner.nextLine());
            FileOutputStream file3 = new FileOutputStream(scanner.nextLine())) {
            int fileSize = file1.available();
            byte[] buffer = new byte[fileSize];
            if (fileSize % 2 != 0) {
                fileSize = fileSize / 2 + 1;
            } else {
                fileSize = fileSize / 2;
            }
            int i = 0;
            while (file1.available() > 0) {
                buffer[i] = (byte) file1.read();
                i++;
            }
            file2.write(buffer, 0, fileSize);
            file3.write(buffer, fileSize, buffer.length - fileSize);
        }
    }
}
