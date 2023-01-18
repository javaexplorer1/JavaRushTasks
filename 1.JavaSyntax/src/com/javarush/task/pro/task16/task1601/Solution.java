package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {
                                                                 //     чт пт сб  вс пн вт ср чт
    static Date birthDate = new Date(78, 7, 26);   //    24  25 26 27 28 29 30 31

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String [] daysOfWeek = new String[] {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        return daysOfWeek[date.getDay()];
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
//        return formatter.format(calendar.getTime());
    }
}
