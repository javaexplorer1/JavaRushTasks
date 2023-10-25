package com.javarush.task.sql.test;

/* Test task for HRLink
*
* */
public class Test {

    public static int calculate(int n, int left, int right) {
        int count = 0;
        while (!(((left ==0 || right == n) && (left < right))
            || ((left ==n || right == 0) && ((left - right) == 1))
        || (((left - right) == 2) && (right == 0)))) {
            if (left < right || ((left - right) >= 3)) {
                left--;
                right++;
            } else if ((left - right) == 2) {
                left--;
                int temp = right;
                right = left;
                left = temp - 1;
            } else {
                int temp = right;
                right = left;
                left = temp;
                left--;
                right++;
            }
            count++;
        }
        return ++count;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5, 2, 3));
    }
}
