package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.checkAccess;

public class Solution {
    public static void main(String[] args) {
        String accessRank = "";
        String[] accessRanks = new String[]{"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        for (String role : accessRanks) {
            if (CaptainBridge.debugAccess(role)) {
                accessRank = role;
            }
        }
        checkAccess(accessRank);
    }
}
