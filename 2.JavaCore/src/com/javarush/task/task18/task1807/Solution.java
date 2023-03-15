package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        char symbol = ',';
        int ascii = symbol;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(new Scanner(System.in).nextLine())))) {
            while (reader.ready()) {
                if (ascii == reader.read()) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
