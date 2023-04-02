package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file1 = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter file2 = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (file1.ready()) {
                String string = file1.readLine();
                String[] strings = string.split(" ");
                for (String element : strings) {
                    double number = Double.parseDouble(element);
                    file2.write(String.valueOf(Math.round(number)));
                    file2.write(" ");
                }
            }
        }
    }
}
