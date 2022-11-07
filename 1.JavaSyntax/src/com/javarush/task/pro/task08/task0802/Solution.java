package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
*/

public class Solution {

    public static double sqrt(double a) {

        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        /* if (power == 0) {
            return 1;
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = number;
        for (int i = 1; i < modulus; i++) {
            result *= number;
        }
        */

        return Math.pow(number, power);  // power < 0 ? 1.0 / result : result;
    }
}
