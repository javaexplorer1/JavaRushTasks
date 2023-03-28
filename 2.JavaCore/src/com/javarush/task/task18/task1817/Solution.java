package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int sum = 0;
        int spaceCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                char symbol = (char) reader.read();
                if (symbol == ' ') {
                    spaceCount++;
                }
                sum++;
            }
        }
        double otn = (double) spaceCount / sum * 100;
        System.out.printf("%.2f", otn);
    }
}
