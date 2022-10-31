package com.javarush.task.pro.task05.task0527;

/* 
Подготовка Кибердракона
*/

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[2 * i + 1];
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = j + i;
            }
        }

         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
