package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


/* 
Самый богатый
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                String name = strings[0];
                double value = Double.parseDouble(strings[1]);
                map.merge(name, value, Double::sum);
            }
        }
        double max = map.values().stream().max(Double::compare).get();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
        map.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), map.values().stream().max(Double::compare).orElseThrow()))
                .forEach(entry -> System.out.println(entry.getKey()));
    }

    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();

        Files.readAllLines(Paths.get(args[0])).stream()
                .map(e -> e.split(" "))
                .forEach(strings -> map.merge(strings[0], Double.parseDouble(strings[1]), Double::sum));

        map.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), map.values().stream().max(Double::compare).orElseThrow()))
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
