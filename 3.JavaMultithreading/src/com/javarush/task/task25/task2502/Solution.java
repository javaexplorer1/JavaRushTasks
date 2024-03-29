package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            if (loadWheelNamesFromDB() == null || loadWheelNamesFromDB().length != 4) {
                throw new RuntimeException();
            }
            wheels = new ArrayList<>();
            for (String wheel : loadWheelNamesFromDB()) {
                try {
                    Wheel wheel1 = Wheel.valueOf(wheel);
                    wheels.add(wheel1);
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
