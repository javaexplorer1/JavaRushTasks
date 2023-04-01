package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (file1.ready()) {
                sb.append(file1.readLine());
            }
            file2.write(sb.toString().replaceAll("\\p{Punct}", ""));
        }
    }
}
