package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("иисмимс вапва", 5.0);
        grades.put("авыа авыа", 4.0);
        grades.put("мчм чсмчмч", 3.0);
        grades.put("иисмчмсчмимс чсмч", 3.0);
        grades.put("вап ппвп", 5.0);

    }
}
