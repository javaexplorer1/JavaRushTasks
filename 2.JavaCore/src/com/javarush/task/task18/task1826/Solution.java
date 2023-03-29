package com.javarush.task.task18.task1826;


import java.io.*;

/* 
Шифровка
*/

public class Solution {
/*    The program starts with one of the following parameter sets:
    -e fileName fileOutputName
    -d fileName fileOutputName*/

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" +
            "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ !#$%&()—*+,-./:;<=>?@[]^_{|}~";
    private static int key = 3;

    public static void main(String[] args) throws Exception {

       /* if (args[0].equals("-e")) {
            key = key;
        } else if (args[0].equals("-d")) {
            key *= -1;
        } else {
            return;
        }

        try (BufferedReader fileToRead = new BufferedReader(new FileReader(args[1]));
             BufferedWriter fileToWrite = new BufferedWriter(new FileWriter(args[2]))) {
            while (fileToRead.ready()) {
                String line = fileToRead.readLine();
                char[] chars = line.toCharArray();
                int newIndex = 0;
                StringBuilder builder = new StringBuilder();
                for (char aChar : chars) {
                    int index = ALPHABET.indexOf(aChar);
                    newIndex = (index + key) % ALPHABET.length();
                    newIndex = (newIndex < 0) ? newIndex + ALPHABET.length() : newIndex;
                    builder.append(ALPHABET.charAt(newIndex));
                }
                //builder.append(System.lineSeparator());
                fileToWrite.write(builder.toString());
            }
        }*/

       /* BufferedReader fileToRead = null;
        BufferedWriter fileToWrite = null;

        try {
            fileToRead = new BufferedReader(new FileReader(args[1]));
            fileToWrite = new BufferedWriter(new FileWriter(args[2]));
            if (args[0].equals("-e")) {
                while (fileToRead.ready()) {
                    String line = fileToRead.readLine();
                    char[] chars = line.toCharArray();
                    int newIndex = 0;
                    StringBuilder builder = new StringBuilder();
                    for (char aChar : chars) {
                        int index = ALPHABET.indexOf(aChar);
                        newIndex = (index + key) % ALPHABET.length();
                        newIndex = (newIndex < 0) ? newIndex + ALPHABET.length() : newIndex;
                        builder.append(ALPHABET.charAt(newIndex));
                    }

                    fileToWrite.write(builder.toString());
                }
            } else if (args[0].equals("-d")) {
                while (fileToRead.ready()) {
                    String line = fileToRead.readLine();
                    char[] chars = line.toCharArray();
                    int newIndex = 0;
                    StringBuilder builder = new StringBuilder();
                    for (char aChar : chars) {
                        int index = ALPHABET.indexOf(aChar);
                        newIndex = (index - key) % ALPHABET.length();
                        newIndex = (newIndex < 0) ? newIndex + ALPHABET.length() : newIndex;
                        builder.append(ALPHABET.charAt(newIndex));
                    }

                    fileToWrite.write(builder.append(System.lineSeparator()).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileToRead.close();
            fileToWrite.close();
        }*/

        BufferedReader fileToRead = null;
        BufferedWriter fileToWrite = null;

        try {
            fileToRead = new BufferedReader(new FileReader(args[1]));
            fileToWrite = new BufferedWriter(new FileWriter(args[2]));
            if (args[0].equals("-e")) {
                while (fileToRead.ready()) {
                    String line = fileToRead.readLine();
                    char[] chars = line.toCharArray();
                    int newIndex = 0;
                    StringBuilder builder = new StringBuilder();
                    for (char aChar : chars) {
                        int index = aChar;
                        newIndex = (index + key);
                        builder.append((char) newIndex);
                    }

                    fileToWrite.write(builder + System.lineSeparator());
                }
            } else if (args[0].equals("-d")) {
                while (fileToRead.ready()) {
                    String line = fileToRead.readLine();
                    char[] chars = line.toCharArray();
                    int newIndex = 0;
                    StringBuilder builder = new StringBuilder();
                    for (char aChar : chars) {
                        int index = aChar;
                        newIndex = (index - key);
                        builder.append((char) newIndex);
                    }

                    fileToWrite.write(builder + System.lineSeparator());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileToRead.close();
            fileToWrite.close();
        }

    }
}
