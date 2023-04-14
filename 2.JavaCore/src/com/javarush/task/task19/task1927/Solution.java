package com.javarush.task.task19.task1927;

import java.io.*;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream oldStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(oldStream);
        byte[] arrBytes = byteArrayOutputStream.toByteArray();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(arrBytes)))) {
            int count = 0;
            while (reader.ready()) {
                String string = reader.readLine();
                System.out.println(string);
                count++;
                if (count == 2) {
                    System.out.println("JavaRush - курсы Java онлайн");
                    count = 0;
                }
            }

        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
