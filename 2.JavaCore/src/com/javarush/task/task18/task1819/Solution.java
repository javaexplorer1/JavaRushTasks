package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String file1Name = console.nextLine();
        int size1;
        try (FileInputStream file1 = new FileInputStream(file1Name)) {
            size1 = file1.available();
        }
        byte[] buffer = new byte[size1];
        try (FileInputStream file1 = new FileInputStream(file1Name)) {
            int i = 0;
            while (file1.available() > 0) {
                buffer[i] = (byte) file1.read();
                i++;
            }
        }
        try (FileOutputStream file1 = new FileOutputStream(file1Name);
             FileInputStream file2 = new FileInputStream(console.nextLine())) {

            while (file2.available() > 0) {
                file1.write(file2.read());
            }
            file1.write(buffer);
        }
    }
}
