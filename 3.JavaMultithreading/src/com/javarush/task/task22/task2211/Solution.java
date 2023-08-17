package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream(args[0]);
             FileOutputStream outputStream = new FileOutputStream(args[1])) {

            byte[] buffer = new byte[1000];
            int count;
            while ((count = inputStream.read(buffer)) > 0) {
                String string = new String(buffer, "Windows-1251");
                buffer = string.getBytes("UTF-8");
                int bufLength = buffer.length;
                outputStream.write(buffer, 0, buffer.length);
            }
        }
    }
}
