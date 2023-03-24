package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader file1 = new BufferedReader(new FileReader(console.readLine()));
            BufferedReader file2 = new BufferedReader(new FileReader(console.readLine()))) {
            while (file1.ready()) {
                listOne.add(file1.readLine());
            }
            while ((file2.ready())) {
                listTwo.add(file2.readLine());
            }
        }
        while (listOne.size() > 0 && listTwo.size() > 0) {
            if (listOne.get(0).equals(listTwo.get(0))) {
                lines.add(new LineItem(Type.SAME, listOne.get(0)));
                listOne.remove(0);
                listTwo.remove(0);
            } else if (listOne.get(0).equals(listTwo.get(1))) {
                lines.add(new LineItem(Type.ADDED, listTwo.get(0)));
                listTwo.remove(0);
            } else if (listOne.get(1).equals(listTwo.get(0))) {
                lines.add(new LineItem(Type.REMOVED, listOne.get(0)));
                listOne.remove(0);
            }
        }
        if (listOne.isEmpty()) {
            listTwo.forEach(x -> lines.add(new LineItem(Type.ADDED, x)));
        }
        if (listTwo.isEmpty()) {
            listOne.forEach(x -> lines.add(new LineItem(Type.REMOVED, x)));
        }
        lines.forEach(System.out::println);

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }
}
