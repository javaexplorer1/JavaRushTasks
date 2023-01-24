package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }


    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
