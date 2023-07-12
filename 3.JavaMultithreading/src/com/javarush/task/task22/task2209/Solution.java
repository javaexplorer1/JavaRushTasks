package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] strings = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                strings = reader.readLine().split(" ");
            }
        }
        System.out.println(getLine(strings));
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        if (words == null || words.length == 0) {
            return builder;
        }
        List<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {

            builder.append(word);

            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);

            int count = 0;
            while (!list.isEmpty()) {

                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);

                String secondStartChar = list.get(0).substring(0, 1);
                String secondEndChar = list.get(0).substring(list.get(0).length() - 1);

                if (firstEndChar.equalsIgnoreCase(secondStartChar)) {
                    builder.append(" ").append(list.get(0));
                    list.remove(0);
                } else if (firstStartChar.equalsIgnoreCase(secondEndChar)) {
                    builder.insert(0, list.get(0) + " ");
                    list.remove(0);
                } else {
                    String str = list.get(0);
                    list.remove(0);
                    list.add(str);
                    count++;
                    if (count > words.length * word.length()) {
                        break;
                    }
                }
            }
            builderList.add(builder);
            builder = new StringBuilder();
        }
        return builderList.stream().max(Comparator.comparingInt(StringBuilder::length)).get();
    }


 /*   public static StringBuilder getLine(String... words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        StringBuilder builder = new StringBuilder(list.get(0));
        list.remove(0);
        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);
                String secondStartChar = list.get(i).substring(0, 1);
                String secondEndChar = list.get(i).substring(list.get(i).length() - 1);
                if (firstEndChar.equalsIgnoreCase(secondStartChar)) {
                    builder.append(" ").append(list.get(i));
                    list.remove(i);
                    i--;
                } else if (firstStartChar.equalsIgnoreCase(secondEndChar)) {
                    builder.insert(0, list.get(i) + " ");
                    list.remove(i);
                    i--;
                }
            }
        }
        return builder;
    }*/
}
