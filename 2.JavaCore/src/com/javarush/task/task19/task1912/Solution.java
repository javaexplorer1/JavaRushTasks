package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldPrintStream = System.out;
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String string = byteOutputStream.toString();
        System.setOut(oldPrintStream);
        System.out.println(string.replaceAll("te", "??"));


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
