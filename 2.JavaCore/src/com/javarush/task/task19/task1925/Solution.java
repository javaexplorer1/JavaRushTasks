package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                for (String str : strings) {
                    if (str.length() > 6) {
                        builder.append(str).append(",");
                    }
                }
            }
            builder.deleteCharAt(builder.length() - 1);
            writer.write(builder.toString());
        }
    }
}
