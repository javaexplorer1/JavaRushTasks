package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file = new BufferedReader(new FileReader(reader.readLine()))) {
            while (file.ready()) {
                String string = file.readLine().replaceAll("\\p{Punct}", " ");
                String[] array = string.split(" ");
                for (String str : array) {
                    if (str.equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}