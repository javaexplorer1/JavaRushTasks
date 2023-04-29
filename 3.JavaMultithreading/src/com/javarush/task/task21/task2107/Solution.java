package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {

    protected Map<String, User> users = new LinkedHashMap<>();

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution newSolution = new Solution();
        Map<String, User> map = new LinkedHashMap<>();
        for (String key : users.keySet()) {
            map.put(key, users.get(key).clone());
        }
        newSolution.users = map;
        return newSolution;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Solution)) {
            return false;
        }
        Solution newSol = (Solution) obj;
        return Objects.equals(users, newSol.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        clone = (Solution) solution.clone();
        System.out.println(solution);
        System.out.println(clone);


        System.out.println(solution.users);
        System.out.println(clone.users);
        System.out.println(solution == clone);
        System.out.println(solution.users == clone.users);
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public User() {

        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            User user = new User();
            user.age = this.age;
            user.name = this.name;
            return user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
