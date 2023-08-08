package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

     public boolean equals(Object n) {

        if (this == n) return true;
        if (n == null) return false;
        if (!(n instanceof Solution)) {
            return false;
        }
        Solution solution = (Solution) n;
        if ((this.first != null ? this.first.equals(solution.first) : solution.first == null)
        && (this.last != null ? this.last.equals(solution.last) : solution.last == null)) {
            return true;
        } else {
            return false;
        }

    }


    public int hashCode() {
        return Objects.hash(first, last);

    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
