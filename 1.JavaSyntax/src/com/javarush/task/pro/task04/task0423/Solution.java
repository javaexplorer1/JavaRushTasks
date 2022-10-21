package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avg = 0;
        for (int i = 1; i <=5; i++) {
            int temp = scanner.nextInt();
            avg = avg + temp;
        }
        System.out.println((avg * 1.0) / 5);
    }
}
