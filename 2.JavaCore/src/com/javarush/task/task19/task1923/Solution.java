package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
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
                    if (str.matches(".*[0-9].*")) {
                        builder.append(str).append(" ");
                    }
                }
            }
            writer.write(builder.toString());
        }
    }
}
