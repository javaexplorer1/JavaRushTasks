package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                int max = 0;
                while (reader.ready()) {
                    String line = reader.readLine().substring(0, 8).trim();
                    int id = Integer.parseInt(line);
                    if (id > max) {
                        max = id;
                    }
                }
                if (args.length !=0) {
                    if (args[0].equals("-c")) {
                        String id = checkLength(String.valueOf(++max), 8);
                        String productName = checkLength(args[1], 30);
                        String price = checkLength(args[2], 8);
                        String quantity = checkLength(args[3], 4);
                        writer.newLine();
                        writer.write(id + productName + price +quantity);

                    }
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
