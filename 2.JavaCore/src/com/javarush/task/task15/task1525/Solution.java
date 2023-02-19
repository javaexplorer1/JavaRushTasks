package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/


public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {

        try (BufferedReader input = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(Statics.FILE_NAME))))) {
            while (input.ready()) {
                lines.add(input.readLine());
            }
        } catch (IOException e) {

        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
