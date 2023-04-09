package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        String line;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(line = console.readLine()).equals("exit")) {
                Thread thread = new ReadThread(line);
                thread.start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            try (FileInputStream input = new FileInputStream(fileName)) {

                while (input.available() > 0) {
                    int read = input.read();
                   /* if (!map.containsKey(read)) {
                        map.put(read, 1);
                    } else {
                        map.put(read, map.get(read) + 1);
                    }*/
                    map.merge(read, 1, Integer::sum);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
 /*           Без определения наименьшего
            Integer max = map.values().stream().max(Comparator.comparingInt(x -> x)).get();
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (Objects.equals(pair.getValue(), max)) {
                    resultMap.put(fileName, pair.getKey());
                    break;
                }
            }*/

            Integer max = map.values().stream().max(Comparator.comparingInt(x -> x)).orElse(null);  // а не .get();
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (Objects.equals(pair.getValue(), max)) {
                    list.add(pair.getKey());
                }
            }
            list.sort(Comparator.comparingInt(x -> x));
            resultMap.put(fileName, list.get(0));
        }
    }
}
