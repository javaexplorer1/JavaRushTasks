package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new SuspensionBridge());
        println(new WaterBridge());

    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}

