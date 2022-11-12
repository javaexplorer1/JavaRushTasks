package com.javarush.task.pro.task08.task0810;

import java.util.concurrent.TimeUnit;

/* 
Таймер
*/

public class Solution {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        if (days > 0) {
            TimeUnit.DAYS.sleep(days);
        } else if (hours > 0) {
            TimeUnit.HOURS.sleep(hours);
        } else if (minutes > 0) {
            TimeUnit.MINUTES.sleep(minutes);
        } else if (seconds > 0) {
        TimeUnit.SECONDS.sleep(seconds);
        } else if (millis > 0) {
            TimeUnit.MILLISECONDS.sleep(millis);
        }
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
