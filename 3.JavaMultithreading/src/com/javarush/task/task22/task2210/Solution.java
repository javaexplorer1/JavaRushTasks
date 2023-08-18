package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        int countTokens = tokenizer.countTokens();
        String[] strings = new String[countTokens];
        for (int i = 0; i < countTokens; i++) {
            String string = tokenizer.nextToken();
            strings[i] = string;
        }
        return strings;
    }
}
