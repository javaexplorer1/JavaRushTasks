package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        try (FileInputStream input = new FileInputStream((new Scanner(System.in)).nextLine())) {
            while (input.available() > 0) {
                int byteFile = input.read();
                if (!map.containsKey(byteFile)) {
                    map.put(byteFile, 1);
                } else {
                    map.put(byteFile, map.get(byteFile) + 1);
                }
            }
        }
        int max = 0;
        for (Integer value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            if (entries.getValue() == max ) {
                sb.append(entries.getKey());
            }
        }
        System.out.println(sb);

  /*      map.entrySet().stream()
                .filter(pair -> pair.getValue()
                        .equals(map.values()
                                .stream()
                                .max(Comparator.comparingInt(x -> x))
                                .get()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(integer -> System.out.print(integer + " "));*/
    }
}
