package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse hors : horses) {
            hors.move();
        }

    }
    public void print() {
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        horses.sort(Comparator.comparingDouble(Horse::getDistance));
        Collections.reverse(horses);
        return horses.get(0);

    }
    public void printWinner() {
        System.out.print("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Key", 3, 0));
        horses.add(new Horse("Arrow", 3, 0));
        horses.add(new Horse("Victory", 3, 0));
        game = new Hippodrome(horses);
        game.run();

//        game.getWinner();
//        game.printWinner();
//        System.out.println("===============");
//
//        for (Horse hors : horses) {
//            System.out.println(hors.getName() + "\t" + hors.getDistance());
//        }
    }
}
