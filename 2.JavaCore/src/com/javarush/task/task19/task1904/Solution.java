package com.javarush.task.task19.task1904;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Downloads\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\test.txt");
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(file));
        for (int i = 0; i < 2; i++) {
            System.out.println(personScannerAdapter.read());
        }

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fs) {
            this.fileScanner = fs;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] strings = line.split(" ");
            int year = Integer.parseInt(strings[5]);
            int month = Integer.parseInt(strings[4]);
            int dayOfMonth = Integer.parseInt(strings[3]);
            Calendar calendar = new GregorianCalendar(year, month - 1, dayOfMonth);
            Date date = calendar.getTime();
            return new Person(strings[1], strings[2], strings[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
