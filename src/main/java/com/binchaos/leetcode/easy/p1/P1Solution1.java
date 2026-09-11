package com.binchaos.leetcode.easy.p1;

/**
 * 暴力求解
 * 时间复杂度：O(n^2)
 *
 * @author Vincent
 */
public class P1Solution1 extends P1Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
