package com.binchaos.leetcode.easy.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口 + Map 记录元素索引
 * 时间复杂度：O(n)
 *
 * @author Vincent
 */
public class P3Solution2 extends P3Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        // 参数校验
        if (s == null || s.length() > 100_000) {
            throw new IllegalArgumentException();
        }

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        // 滑动窗口
        char[] charArray = s.toCharArray();
        int startIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (!map.containsKey(charArray[i])) {
                map.put(charArray[i], i);
            } else {
                // 重复元素的索引
                Integer index = map.get(charArray[i]);
                // 移除 [stratIndex, index) 区间的所有元素
                for (int j = startIndex; j < index; j++) {
                    map.remove(charArray[j]);
                }
                // 给 index 处的元素新的 索引
                map.put(charArray[i], i);
                startIndex = index + 1;
            }
            max = Math.max(max, (i - startIndex) + 1);
        }

        return max;
    }
}
