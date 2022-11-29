package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digitCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char aChar = string.charAt(i);
            if (Character.isDigit(aChar)) {
                digitCount++;
            }
        }
        return  digitCount;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (char aChar : string.toCharArray()) {
            if (Character.isLetter(aChar)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (char aChar : string.toCharArray()) {
            if (Character.isSpaceChar(aChar)) {
                count++;
            }
        }
        return count;
    }
}
