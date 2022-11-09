package com.creasypita.leetcode;

/**
 * Created by lujq on 11/8/2022.
 * tag :数组
 */
public class Q704_binary_search {

    public int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{ 1,4,6,9,100,105 };
        int[] intArray = new int[]{  1,4,6,9,100,105 };
        System.out.println("search result :" + new Q704_binary_search().search(intArray, 6));

    }
}
