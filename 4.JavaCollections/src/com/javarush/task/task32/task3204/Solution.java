package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        do {
            for (int i = 0; i < 8; i++) {
                int index = random.nextInt(alphabet.length());
                char charAt = alphabet.charAt(index);
                password.append(charAt);
            }
        System.out.println(password.toString() + " " + password.toString().matches("\\d+"));
            System.out.println();
            password.delete(0, password.length() - 1);
        }
        while (alphabet.length() > 0);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(password.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return outputStream;
    }
}
