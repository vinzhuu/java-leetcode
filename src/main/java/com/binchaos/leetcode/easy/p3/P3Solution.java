package com.binchaos.leetcode.easy.p3;

import org.junit.Assert;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
 *
 * @author Vincent
 */
public abstract class P3Solution {
    public abstract int lengthOfLongestSubstring(String s);

    public void test(String s, int expected) {
        Assert.assertEquals(
                expected,
                lengthOfLongestSubstring(s)
        );
    }
}
