package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            FileOutputStream output = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            for (int i = buffer.length-1; i >= 0 ; i--) {
                output.write(buffer[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
