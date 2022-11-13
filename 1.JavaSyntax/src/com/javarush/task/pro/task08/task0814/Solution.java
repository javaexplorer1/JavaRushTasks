package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        return number = number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        number = ~number;
        number = number | (1 << flagPos);
        return ~number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos) ? true : false;
    }
}
