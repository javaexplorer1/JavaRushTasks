package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        String fileAllLines;
        String fileForRemoveLines;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileAllLines = reader.readLine();
            fileForRemoveLines = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader readerLines = new BufferedReader(new FileReader(fileAllLines));
             BufferedReader readerRemove = new BufferedReader(new FileReader(fileForRemoveLines))) {
            while (readerLines.ready()) {
                allLines.add(readerLines.readLine());
            }
            while (readerRemove.ready()) {
                forRemoveLines.add(readerRemove.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        try {
            (new Solution()).joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}