package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] values = JavarushQuest.values();
        for (JavarushQuest element : values) {
            System.out.println(element.ordinal());
        }
    }
}
