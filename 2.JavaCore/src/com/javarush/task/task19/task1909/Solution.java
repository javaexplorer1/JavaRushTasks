package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (file1.ready()) {
                char aChar = (char) file1.read();
                if (aChar == '.') {
                    aChar = '!';
                }
                file2.write(aChar);
            }
        }
    }
}
