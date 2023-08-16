package com.javarush.task.task18.task1820;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file1 = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter file2 = new BufferedWriter(new FileWriter(console.readLine()))) {
            /*while (file1.ready()) {
                String string = file1.readLine();
                /*String[] strings = string.split(" ");
                for (String element : strings) {
                    double number = Double.parseDouble(element);
                    file2.write(String.valueOf(Math.round(number)));
                    file2.write(" ");*/

            for (String string : Files.readAllLines(Paths.get(file1.readLine()))) {
                file2.write(Arrays.stream(string.split(" ")).map(str -> (int) Math.round(Double.parseDouble(str)))
                        .map(String::valueOf)
                        .collect(Collectors.joining()));
                file2.newLine();
            }

            Files.readAllLines(Paths.get(file1.readLine()))
                    .forEach(e -> {
                        try {
                            file2.write(Arrays.stream(e.split(" ")).map(str -> (int) Math.round(Double.parseDouble(str)))
                                    .map(String::valueOf)
                                    .collect(Collectors.joining()));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });
        }
    }
}

