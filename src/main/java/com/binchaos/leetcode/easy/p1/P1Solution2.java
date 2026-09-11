package com.binchaos.leetcode.easy.p1;

import java.util.HashMap;
import java.util.Map;

/**
 * 时间复杂度：O(n)
 *
 * @author Vincent
 */
public class P1Solution2 extends P1Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 补数
            int complement = target - nums[i];
            // 寻找 map 中是否存在当前元素的补数
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                // 将遍历过的元素放到 map 中
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
