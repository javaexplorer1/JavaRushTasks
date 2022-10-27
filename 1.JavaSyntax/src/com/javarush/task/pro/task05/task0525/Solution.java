package com.javarush.task.pro.task05.task0525;

/* 
Ловушка для Роботанка
*/

public class Solution {
    public static String[] array = {"Amigo", "Diego", "Amigo", "robotank", "Amigo", "Diego"};

    public static void main(String[] args) {


        boolean isMissionComplete = false;
        for (int i = 0; i < array.length; i++) {
            if ("robotank".equalsIgnoreCase(array[i])) {
                isMissionComplete = true;
                break;
            }
        }
        System.out.println(isMissionComplete ? "Mission complete" : "Mission not completed");
    }
}