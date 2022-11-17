package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (int i = 0; i < pastryLoaders.length; i++) {
            for (int j = 0; j < pastryLoaders[i].memory.length; j++) {
                for (int k = 0; k < pastryLoaders[i].memory[j].length; k++) {
                    for (int l = 0; l < pastryLoaders[i].memory[j][k].length; l++) {
                        if (pastryLoaders[i].memory[j][k][l].toLowerCase().contains("nimrod")) {
                            pastryLoaders[i].memory[j][k][l] = pastryLoaders[i].memory[j][k][l].toLowerCase().replace("nimrod", "pirate ship");
                        }
                    }
                }
            }
        }
    }
}
