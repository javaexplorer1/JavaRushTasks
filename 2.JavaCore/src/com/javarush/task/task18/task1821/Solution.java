package com.javarush.task.task18.task1821;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                char symbol = (char) reader.read();
                if (!map.containsKey(symbol)) {
                    map.put(symbol, 1);
                } else {
                    map.put(symbol, map.get(symbol) + 1);
                }
            }
        }

        Set<Character> keySet = map.keySet();
        List<Character> characters =  new ArrayList<>(keySet);
        Collections.sort(characters);

        for (Character character : characters) {
            System.out.println(character + " " + map.get(character));
        }
    }
}
