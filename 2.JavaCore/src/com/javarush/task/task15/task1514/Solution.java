package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {

        labels.put(4234.43d, "dfgfdg");
        labels.put(543.43d, "vvfd");
        labels.put(656.2d, "dfgfdbcvbvg");
        labels.put(546.8d, "vbcvcxb");
        labels.put(34.4d, "dfgcbvcxbxcfdg");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
