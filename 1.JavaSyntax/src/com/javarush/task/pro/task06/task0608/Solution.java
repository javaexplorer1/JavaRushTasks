package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long number = cube(3);
        System.out.println(number);
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
