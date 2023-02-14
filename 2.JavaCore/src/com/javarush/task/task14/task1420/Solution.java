package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String number1 = reader.readLine();
            String number2 = reader.readLine();

            BigInteger bigInteger1 = new BigInteger(number1);
            BigInteger bigInteger2 = new BigInteger(number2);
            BigInteger gcd = bigInteger1.gcd(bigInteger2);
            System.out.println(gcd);
        }
    }
}
