package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        TreeSet<Byte> set = new TreeSet<>();
        byte byteFile;
        try (FileInputStream input = new FileInputStream((new Scanner(System.in)).nextLine())) {
            while (input.available() > 0) {
                byteFile = (byte) input.read();
                if (!set.contains(byteFile)) {
                    set.add(byteFile);
                }
            }

        }
        for (Byte aByte : set) {

            System.out.print(aByte + " ");
        }

    }
}

