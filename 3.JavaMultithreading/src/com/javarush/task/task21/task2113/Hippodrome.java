package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public static Hippodrome game;

    public Hippodrome (List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }


    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Key", 3, 0));
        horses.add(new Horse("Arrow", 3, 0));
        horses.add(new Horse("Victory", 3, 0));
        game = new Hippodrome(horses);
    }
}
