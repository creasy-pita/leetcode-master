package com.creasypita.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lujq on 12/30/2022.
 */
public class Q0349_intersection_of_two_arrays {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,1000};
        int[] b = {2,4, 1000,10002};
        System.out.println(intersection(a, b));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }
        //将结果几何转为数组
        return resSet.stream().mapToInt(x -> x).toArray();
    }
}
