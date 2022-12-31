package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), stackTraceElement.getClassName(),
                    stackTraceElement.getFileName());
        }
    }

    public static void makeScrewdriver() {
        addJuice();
    }

    public static void addJuice() {
        addVodka();
    }

    public static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
