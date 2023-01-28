package com.javarush.task.task13.task1320;

/* 
Neo
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    public static class User implements DBObject {
         long id;
         String name;

        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }



        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}
