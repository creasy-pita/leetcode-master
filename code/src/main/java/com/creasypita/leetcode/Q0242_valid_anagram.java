package com.creasypita.leetcode;

/**
 * Created by lujq on 11/9/2022.
 */
public class Q0242_valid_anagram {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int count: record) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aee";
        String t = "eae";
        System.out.println("t is a valid anagram for s:" + new Q0242_valid_anagram().isAnagram(s, t));
    }
}
