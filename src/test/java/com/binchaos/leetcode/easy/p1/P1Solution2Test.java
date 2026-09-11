package com.binchaos.leetcode.easy.p1;

import org.junit.Test;

/**
 *
 * @author Vincent
 */
public class P1Solution2Test {
    private final P1Solution2 solution = new P1Solution2();

    @Test
    public void case1() {
        solution.test("[2,7,11,15]", 9, "[0,1]");
    }

    @Test
    public void case2() {
        solution.test("[3,2,4]", 6, "[1,2]");
    }

    @Test
    public void case3() {
        solution.test("[3,3]", 6, "[0,1]");
    }
}
