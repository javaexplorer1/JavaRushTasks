package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(oldOut);
        String string = stream.toString();
        String sign = "";
        if (string.contains("+")) {
            sign = "+";
        } else if (string.contains("-")) {
            sign = "-";
        } else if (string.contains("*")) {
            sign = "*";
        }
        int a = Integer.parseInt(string.substring(0, string.indexOf(sign)).trim());
        int b = Integer.parseInt(string.substring(string.indexOf(sign) + 1, string.indexOf("=")).trim());
        int result = 0;
        if (sign.equals("+")) {
            result = a + b;
        } else if (sign.equals("-")) {
            result = a - b;
        } else if (sign.equals("*")) {
            result = a * b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

