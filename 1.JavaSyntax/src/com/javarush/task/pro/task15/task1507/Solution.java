package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
//        List<String> list = new ArrayList<>();
//        try (FileReader fileReader = new FileReader(fileName);
//             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//            while (bufferedReader.ready()) {
//                String string = bufferedReader.readLine();
//                list.add(string);
//            }
//        }
        List<String> strings = Files.readAllLines(Path.of(fileName));
        for (int i = 0; i < strings.size(); i+=2) {
            System.out.println(strings.get(i));
        }
    }
}

