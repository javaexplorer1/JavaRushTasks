package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String line = reader.readLine();
                if (line.equals("end")) {
                    break;
                }
                int number = Integer.parseInt(line.substring(line.lastIndexOf("t") + 1));
                if (!map.containsKey(number)) {
                    map.put(number, line);
                }
            }
        }
        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName, true))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }
        }
    }
}
