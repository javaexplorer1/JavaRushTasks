package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double S = pi * radius * radius;
        System.out.println((int)S);
    }
}