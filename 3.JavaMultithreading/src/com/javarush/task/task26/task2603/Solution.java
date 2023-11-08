package com.javarush.task.task26.task2603;

import java.util.Collections;
import java.util.Comparator;

/* 
Убежденному убеждать других не трудно
*/

public class Solution {

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        public int compare(T o1, T o2) {

            for (Comparator<T> comparator : comparators) {
                int compare = comparator.compare(o1, o2);
                if (compare != 0) {
                    return compare;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Comparator<String> comparator1 = (a, b) -> a.compareTo(b);
        Comparator<String> comparator2 = (a, b) -> a.length() - b.length();
        Comparator[] comparators = {comparator2, comparator1};
        CustomizedComparator<String> customizedComparator = new CustomizedComparator<String>(comparators);
        int compare = customizedComparator.compare("Helloa", "Hellow");
        System.out.println(compare);


    }
}
