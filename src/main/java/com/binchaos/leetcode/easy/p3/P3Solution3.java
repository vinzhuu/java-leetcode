package com.binchaos.leetcode.easy.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * 滑动窗口 + Set 记录已遍历的索引
 * 时间复杂度：O(n)
 *
 * @author Vincent
 */
public class P3Solution3 extends P3Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        // 参数校验
        if (s == null || s.length() > 100_000) {
            throw new IllegalArgumentException();
        }

        Set<Character> set = new HashSet<>();
        int max = 0;

        // 滑动窗口
        char[] charArray = s.toCharArray();
        int startIndex = 0;
        for (int endIndex = 0; endIndex < charArray.length; endIndex++) {
            char ch = charArray[endIndex];
            // 移除所有位于 startIndex 到 已加入 Set 中的 ch 的索引 之间的元素。
            while (set.contains(ch)) {
                set.remove(charArray[startIndex]);
                startIndex++;
            }
            set.add(ch);
            max = Math.max(max, (endIndex - startIndex) + 1);
        }

        return max;
    }
}
