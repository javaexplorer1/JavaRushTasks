package com.javarush.task.pro.task14.task1422;

/* 
Сбор и сканирование ДНК
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printDNA();
    }

    public static void printDNA() {
        List<StackTraceElement[]> elements = getDNA();
        int count = 0;
        for (StackTraceElement[] elementStackTrace : elements) {
            System.out.println("count: " + count);
            for (int i = 0; i < elementStackTrace.length; i++) {
                System.out.println("i: " + i + " File name: " + elementStackTrace[i].getFileName()
                        + ", Method name: " + elementStackTrace[i].getMethodName()
                        + ", Line number: " + elementStackTrace[i].getLineNumber());
            }
            count++;
            System.out.println();
        }
    }

    private static List<StackTraceElement[]> getDNA() {
        List<StackTraceElement[]> list = new ArrayList<>();

        list.add(adenine());
        list.add(thymine());
        list.add(cytosine());
        list.add(guanine());

        return list;
    }

    private static StackTraceElement[] adenine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] thymine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] cytosine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] guanine() {
        return Thread.currentThread().getStackTrace();
    }
}