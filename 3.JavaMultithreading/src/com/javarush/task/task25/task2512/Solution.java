package com.javarush.task.task25.task2512;

import java.util.LinkedList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        Throwable cause = e.getCause();
        if (cause != null) {
            uncaughtException(t, e.getCause());
        }
        System.out.println(e.getClass().getName() + ": " + e.getMessage());
    }

    public static void main(String[] args) {
        new Solution().uncaughtException(new Thread("Thread-1"), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}

