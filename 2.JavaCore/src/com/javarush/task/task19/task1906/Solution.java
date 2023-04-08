package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;


/* 
Четные символы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(console.readLine());
             FileWriter writer = new FileWriter(console.readLine())) {
            while (reader.ready()) {
                int read = reader.read();
                list.add(read);
            }
            for (int i = 1; i < list.size(); i += 2) {
                writer.write(list.get(i));
            }
        }
    }
}

