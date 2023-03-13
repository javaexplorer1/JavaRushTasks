package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        int byteFile = 0;
        try (FileInputStream input = new FileInputStream((new Scanner(System.in)).nextLine())) {
            while (input.available() > 0) {
                byteFile = input.read();
                if (!map.containsKey(byteFile)) {
                    map.put(byteFile, 1);
                } else {
                    map.put(byteFile, map.get(byteFile) + 1);
                }
            }
        }
        int min = map.get(byteFile);
        for (Integer value : map.values()) {
            if (value < min) {
                min = value;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == min) {
                sb.append(pair.getKey()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
