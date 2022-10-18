package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Через тернии...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;
        if (number < 5) {
            result = "число меньше 5";
        }
        else {
            if (number > 5) {
                result = "число больше 5";
            }
            else {
                result = "число равно 5";
            }
        }
        System.out.println(result);
    }
}
