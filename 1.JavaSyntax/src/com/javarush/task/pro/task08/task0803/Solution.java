package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }

        return min;
}

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] intArray = new int [10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = console.nextInt();
        }
        return intArray;
    }
}
