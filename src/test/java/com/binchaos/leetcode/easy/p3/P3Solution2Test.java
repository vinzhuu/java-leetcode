package com.binchaos.leetcode.easy.p3;

import org.junit.Test;

/**
 *
 * @author Vincent
 */
public class P3Solution2Test {
    private final P3Solution2 solution = new P3Solution2();

    @Test
    public void case1() {
        solution.test("abcabcbb", 3);
    }

    @Test
    public void case2() {
        solution.test("bbbbb", 1);
    }

    @Test
    public void case3() {
        solution.test("pwwkew", 3);
    }

    @Test
    public void case4() {
        solution.test("mq", 2);
    }

}
