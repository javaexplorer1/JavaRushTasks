package com.javarush.task.task26.task2606;

public class Test {
    private String name;

    private Test(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Test test = new Test("Ivan");
        System.out.println(test.name);
    }

}
