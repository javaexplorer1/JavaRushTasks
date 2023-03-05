package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new LinkedHashMap<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                    String str = reader.readLine();
                    String index = str.substring(0, 8).trim();
                    String string = str.substring(8);
                    if (!map.containsKey(index)) {
                        map.put(index, string);
                    }
                }
            }
            if (args.length != 0) {
                if (args[0].equals("-u")) {
                    String id = args[1].trim();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (id.equals(entry.getKey())) {
                            map.put(id, checkLength(args[2], 30) +
                                    checkLength(args[3], 8) +
                                    checkLength(args[4], 4));
                        }
                    }
                } else if (args[0].equals("-d")) {
                    String id = args[1].trim();
                    map.keySet().removeIf(key -> key.equals(id));
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    writer.write(checkLength(entry.getKey(), 8) + entry.getValue());
                    writer.newLine();
                }
            }
        }
    }

    public static String checkLength(String string, int limit) {
        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            while (string.length() < limit) {
                string = string + " ";
            }
            return string;
        }
    }
}
