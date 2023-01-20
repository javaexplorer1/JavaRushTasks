package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate localDate = LocalDate.now();
        return localDate;

    }

    static LocalDate ofExample() {
        LocalDate localDate = LocalDate.of(2020, 9, 12);
        return localDate;
    }

    static LocalDate ofYearDayExample() {
       LocalDate localDate = LocalDate.ofYearDay(2020, 256);
       return localDate;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate localDate = LocalDate.ofEpochDay(18517);
        return localDate;
    }
}
