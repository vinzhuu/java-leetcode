package com.binchaos.leetcode.easy.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * 暴力求解
 * 时间复杂度：O(n^2)
 *
 * @author Vincent
 */
public class P3Solution1 extends P3Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        // 参数校验
        if (s == null || s.length() > 100_000) {
            throw new IllegalArgumentException();
        }

        char[] charArray = s.toCharArray();
        int max = 0;

        // 暴力求解
        // 双层遍历：
        // 第一层：选择一个字符为子字符串开头。
        // 第二层：遍历这个字符串后续的字符，直到出现重复的字符。
        // 这样就能找到以每个字符开头的最大的不出现重复字符的子字符串。
        for (int i = 0; i < charArray.length; i++) {
            Set<Character> set = new HashSet<>();
            set.add(charArray[i]);
            int count = 1;

            for (int j = i + 1; j < charArray.length; j++) {
                if (!set.contains(charArray[j])) {
                    count++;
                    set.add(charArray[j]);
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
