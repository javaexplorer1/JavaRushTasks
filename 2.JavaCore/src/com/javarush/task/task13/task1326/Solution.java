package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            while (reader.ready()) {
                int number = Integer.parseInt(reader.readLine());
                if ((number % 2) == 0) {
                    list.add(number);
                }
            }
            Collections.sort(list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (Integer integer : list) {
            System.out.println(integer);      //  C:\Downloads\text.txt
        }
    }
}

