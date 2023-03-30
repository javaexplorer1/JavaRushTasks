package com.javarush.task.task18.task1818;


/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);

        try (FileOutputStream file1 = new FileOutputStream(console.nextLine(), true);
             FileInputStream file2 = new FileInputStream(console.nextLine());
             FileInputStream file3 = new FileInputStream(console.nextLine())) {
            while (file2.available() > 0) {
                file1.write(file2.read());
            }
            while (file3.available() > 0) {
                file1.write(file3.read());
            }
        }
    }
}
