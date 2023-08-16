package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        int firstSpace = string.indexOf(" ");
        String[] words = string.split(" ");
        if (words.length < 5) {
            throw new TooShortStringException();
        }
        return words[1] + " " + words[2] + " " + words[3] + " " + words[4];
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
