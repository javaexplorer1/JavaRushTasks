package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        while (true) {
            String fileName = console.nextLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                fileInputStream.read();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
