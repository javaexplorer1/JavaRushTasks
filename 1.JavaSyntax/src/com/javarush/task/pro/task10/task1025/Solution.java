package com.javarush.task.pro.task10.task1025;

/* 
Взлом ретранслятора
*/

public class Solution {

    public static void main(String[] args) {
        Repeater repeater = new Repeater();
        int frequency = repeater.getFrequency();
        if ( frequency < 100) {
            repeater.setFrequency(frequency * 10);
        }
        String trajectory = "elliptic";
        if (!(trajectory.equals(repeater.getTrajectory()))) {
            repeater.setTrajectory(trajectory);
        }
    }
}