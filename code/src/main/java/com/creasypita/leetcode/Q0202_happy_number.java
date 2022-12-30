package com.creasypita.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lujq on 12/30/2022.
 */
public class Q0202_happy_number {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(String.format("%s is happy number: %s", n, isHappy(n)));
    }

    public static boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private static int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
