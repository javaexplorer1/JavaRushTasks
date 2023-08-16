package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

        Map<String, String> params = new HashMap<>(); // for check
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (String key : params.keySet()) {
            if (params.get(key) != null) {
                builder.append(key).append(" = '").append(params.get(key)).append("' and ");
            }
        }
        if (builder.length() == 0) {
            return "";
        } else {
            return builder.delete(builder.length() - 5, builder.length()).toString();
        }
    }
}
