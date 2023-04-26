package com.javarush.task.task21.task2106;

import java.util.Date;
import java.util.Objects;

/* 
Ошибка в equals/hashCode
*/

public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution1 = (Solution) o;
        return Objects.equals(this.anInt, solution1.anInt) &&
                Objects.equals(this.string, solution1.string) &&
                Objects.equals(this.aDouble, solution1.aDouble) &&
                Objects.equals(this.date, solution1.date) &&
                Objects.equals(this.solution, solution1.solution);
    }

    @Override
    public int hashCode() {
/*        int result = anInt;
        long temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        result = 31 * result + (string != null ? string.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;*/
        return Objects.hash(anInt, aDouble, string, date, solution);
    }

    public static void main(String[] args) {
        Solution sol1 = new Solution(1313, "sdff", 343.00d, new Date(435333l), null);
        Solution sol2 = new Solution(1313, "sdff", 343.00d, new Date(435333l), null);
        System.out.println(sol1.equals(sol2));
    }
}
