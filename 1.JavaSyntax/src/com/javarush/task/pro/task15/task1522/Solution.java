package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        }
    }
}