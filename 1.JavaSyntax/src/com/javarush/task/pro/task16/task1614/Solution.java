package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant instant = Instant.ofEpochMilli(Long.MAX_VALUE);              //Instant.MAX.getEpochSecond() / 1000);
        return instant;
    }

    static Instant getMaxFromSeconds() {
        Instant instant = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return instant;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant instant = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
        return instant;
    }
}
