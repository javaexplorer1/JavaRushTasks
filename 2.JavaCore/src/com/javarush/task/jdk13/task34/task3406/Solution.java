package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/* 
Классные методы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> map = new HashMap<>();
        for (Class<?> aClass : classes) {
            Method[] declaredMethods = aClass.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            for (Method declaredMethod : declaredMethods) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    //declaredMethod.setAccessible(true);
                    set.add(declaredMethod.getName());
                }
            }
            if (!set.isEmpty()) {
                map.put(aClass, set);
            }
        }
        return map;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
