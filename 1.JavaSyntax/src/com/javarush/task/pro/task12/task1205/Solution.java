package com.javarush.task.pro.task12.task1205;

/* 
Метод деления
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        double result = 0.0;
        if ((a > 0 && b == 0) || (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) ||
                (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY)) {
            result = Double.POSITIVE_INFINITY;
        } else if ((a < 0 && b == 0) || (a == Double.NEGATIVE_INFINITY && b >=0 && b != Double.POSITIVE_INFINITY) ||
                (a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY)) {
            result = Double.NEGATIVE_INFINITY;
        } else if ((a == 0 && b == 0) || (a == Double.NaN) || (b == Double.NaN) || (a == Double.POSITIVE_INFINITY &&
                b == Double.POSITIVE_INFINITY) || (a == Double.POSITIVE_INFINITY &&
                b == Double.NEGATIVE_INFINITY) || (a == Double.NEGATIVE_INFINITY &&
                b == Double.POSITIVE_INFINITY) || (a == Double.NEGATIVE_INFINITY &&
                b == Double.NEGATIVE_INFINITY)) {
            result = Double.NaN;
        } else result = a / b;
        System.out.println(result);
    }
}
