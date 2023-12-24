package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<Object, Integer> map = newHashMap(newArrayList("first", "second"), newArrayList(1, 2));
        System.out.println(map);

        HashMap<String, Integer> hashMap = newHashMap(new ArrayList<>(newHashSet("first", "second")), new ArrayList<>(newHashSet(1, 2)));
        System.out.println(hashMap);
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
//        return new HashSet<>(Arrays.asList(elements));
        return new HashSet<>(Set.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        //напишите тут ваш код
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
//        HashMap<K, V> hashMap = new HashMap<>();
//        for (int i = 0; i < keys.size(); i++) {
//            hashMap.put(keys.get(i), values.get(i));
//        }
//        return hashMap;
       // return IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(integer -> keys.get(integer), integer -> values.get(integer), (a, b) -> b, () -> new HashMap<>()));
        return IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(keys::get, values::get, (a, b) -> b, HashMap::new));
    }
}

