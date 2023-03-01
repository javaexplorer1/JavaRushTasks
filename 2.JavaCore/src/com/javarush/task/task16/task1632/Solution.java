package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        Thread thread3 = new Thread3();
        Thread thread4 = new Thread4();
        Thread thread5 = new Thread5();

        threads = Arrays.asList(thread1, thread2, thread3, thread4, thread5);
    }

    public static void main(String[] args) {

    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }


    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        public void showWarning() {
            interrupt();

        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            int sum = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    String line = reader.readLine();
                    if (line.equals("N")) {
                        break;
                    } else {
                        sum += Integer.parseInt(line);
                    }
                }
                System.out.println(sum);
            } catch (Exception e) {
            }
        }

    }

}