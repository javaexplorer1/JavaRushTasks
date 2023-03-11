package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream input = new FileInputStream((new Scanner(System.in)).nextLine())) {
            int min = input.read();
            while (input.available() > 0) {
                int value = input.read();
                if (value < min) {
                    min = value;
                }
            }
            System.out.println(min);
        } catch (IOException e) {
        }
    }
}
