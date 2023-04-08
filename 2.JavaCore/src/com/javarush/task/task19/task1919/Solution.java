package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> tree = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] string = reader.readLine().split(" ");
                String name = string[0];
                Double value = Double.parseDouble(string[1]);
                if (!tree.containsKey(name)) {
                    tree.put(name, value);
                } else {
                    tree.put(name, tree.get(name) + value);
                }
            }
        }
        for (String s : tree.keySet()) {
            System.out.println(s + " " + tree.get(s));
        }
    }
}
