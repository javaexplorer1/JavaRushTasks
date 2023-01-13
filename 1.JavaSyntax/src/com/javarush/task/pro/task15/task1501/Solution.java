package com.javarush.task.pro.task15.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Сокращаем try
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        }
    }
}
