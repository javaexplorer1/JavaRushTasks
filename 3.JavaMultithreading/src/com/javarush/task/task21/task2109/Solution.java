package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

import java.util.Objects;

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return i == a.i && j == a.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            B b = (B) o;
            return Objects.equals(name, b.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class C extends B implements Cloneable {



        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() throws CloneNotSupportedException {
            C c = new C(getI(), getJ(), getName());
            return c;
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        A objectA = new A(2, 7);
        Object cloneA = objectA.clone();
        System.out.println(objectA.equals(cloneA));

/*
        B objectB = new B(2, 7, "Tom");
        Object cloneB = objectB.clone();
        System.out.println(objectB.equals(cloneB));
*/

        C objectC = new C(2, 5, "Tom");
        Object cloneC = objectC.clone();
        System.out.println(objectC.equals(cloneC));

    }




}
