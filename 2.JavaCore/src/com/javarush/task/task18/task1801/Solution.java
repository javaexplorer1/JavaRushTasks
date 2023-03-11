package com.javarush.task.task18.task1801;

import java.io.*;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        int max = 0;
        try (FileInputStream input = new FileInputStream(fileName)) {
            while (input.available() > 0) {
                int value = input.read();
                if (value > max) {
                    max = value;
                }
            }
        } catch (Exception e) {
        }
        System.out.println(max);
    }
}
