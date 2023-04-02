package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

/*    public static void main2(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] elements = line.split(" ");
                int year = Integer.parseInt(elements[elements.length - 1]);
                int month = Integer.parseInt(elements[elements.length - 2]);
                int day = Integer.parseInt(elements[elements.length - 3]);
                StringBuilder sb = new StringBuilder();
                int count = 0;
                while (count < elements.length - 3) {
                    sb.append(elements[count]).append(" ");
                    count++;
                }
                PEOPLE.add(new Person(sb.toString().trim(), new Date(year - 1900, month - 1, day)));
            }
        }
        PEOPLE.forEach(x -> System.out.println(x.getName() + x.getBirthDate()));
    }

    public static void main3(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll("\\d", "").trim();
                String data = line.replaceAll("\\D", " ").trim();
                PEOPLE.add(new Person(name, new SimpleDateFormat("dd M yyyy").parse(data)));
            }
        }
        PEOPLE.forEach(x -> System.out.println(x.getName() + x.getBirthDate()));
    }

   */

    public static void main(String[] args) throws Exception {
        Files.readAllLines(Paths.get(args[0]))
                .stream()
                .map(e -> new Person(e.replaceAll("\\d", "").trim(),
                        Date.from(LocalDate.parse(e.replaceAll("\\D", " ").trim(), DateTimeFormatter.ofPattern("dd M yyyy")).atStartOfDay(ZoneId.systemDefault()).toInstant())))
                .peek(PEOPLE::add).forEach(person -> System.out.println(person.getName() + " " + person.getBirthDate()));
    }
}
