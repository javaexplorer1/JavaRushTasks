package com.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Оборачивание исключений
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (FileSystemException e1) {
            throw new RuntimeException(e1);
        }
    }
}
