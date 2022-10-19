package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (min > secondMin) {
            int temp = min;
            min = secondMin;
            secondMin = temp;
        }
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (min == secondMin && number > secondMin) {
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            } else if (number > min && number < secondMin) {
                secondMin = number;
            }

        }
        System.out.println(secondMin);
    }
}