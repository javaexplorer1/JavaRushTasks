package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String parameter = reader.readLine();
            if (parameter.equals("helicopter")) {
                result = new Helicopter();
            } else if (parameter.equals("plane")) {
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
