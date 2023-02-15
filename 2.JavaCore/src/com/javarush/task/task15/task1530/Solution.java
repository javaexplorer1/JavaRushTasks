package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        LatteMaker latteMaker = new LatteMaker();
        teaMaker.makeDrink();
        latteMaker.makeDrink();
    }
}
