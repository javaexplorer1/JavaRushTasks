package com.javarush.task.pro.task09.task0925;

/* 
Освобождение Пиратов
*/

import java.util.StringTokenizer;

import java.util.StringTokenizer;

public class Solution {

    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements();
        getStringFromArray();
        printArray(controlUnits);
    }

    public static void splitArrayElements() {
        for (int i = 0; i < controlUnits.length; i++) {
            StringTokenizer string = new StringTokenizer(controlUnits[i], "/");
            String token = "";
            while (string.hasMoreTokens()) {
                token = string.nextToken();
            }
            controlUnits[i] = token;
        }
    }


    public static void getStringFromArray() {
        for (int i = 0; i < controlUnits.length; i++) {
            controlUnits[i] = String.format("Block %s back online.", controlUnits[i]);
        }

    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
