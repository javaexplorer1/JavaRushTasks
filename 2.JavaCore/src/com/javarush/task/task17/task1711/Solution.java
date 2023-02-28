package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;

        switch (args[0]) {       //    toLowerCase()   should be removed!
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 3; i ++) {
                        if (args[i * 3 + 2].equalsIgnoreCase("м")) {
                            person = Person.createMale(args[i * 3 + 1], inputFormat.parse(args[i * 3 + 3]));

                        } else if (args[i * 3 + 2].equalsIgnoreCase("ж")) {
                            person = Person.createFemale(args[i * 3 + 1], inputFormat.parse(args[i *3 + 3]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);

                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 4; i++) {
                        int idInt = Integer.parseInt(args[i *  4 + 1]);
                        if ((idInt >= 0 && idInt < allPeople.size()) && (person = allPeople.get(idInt)) != null) {
                            person.setName(args[i *  4 + 2]);
                            if (args[i *  4 + 3].equalsIgnoreCase("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i *  4 + 3].equalsIgnoreCase("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(inputFormat.parse(args[i *  4 + 4]));
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length - 1; i++) {
                        int idInt = Integer.parseInt(args[i + 1]);
                        if ((idInt >= 0 && idInt < allPeople.size()) && (person = allPeople.get(idInt)) != null) {
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length - 1; i++) {
                        int idInt = Integer.parseInt(args[i + 1]);
                        if ((idInt >= 0 && idInt < allPeople.size()) && (person = allPeople.get(idInt)) != null) {
                            String sex = null;
                            if (person.getSex().equals(Sex.MALE)) {
                                sex = "м";
                            } else if (person.getSex().equals(Sex.FEMALE)) {
                                sex = "ж";
                            }
                            System.out.println(person.getName() + " " + sex + " " + outputFormat.format(person.getBirthDate()));
                        }
                    }
                }
                break;
        }
    }
}
