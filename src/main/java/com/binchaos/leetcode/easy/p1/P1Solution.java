package com.binchaos.leetcode.easy.p1;

import com.binchaos.leetcode.common.array.ArrayUtils;
import org.junit.Assert;

/**
 * 1. 两数之和
 * https://leetcode.cn/problems/two-sum/description/
 *
 * @author Vincent
 */
public abstract class P1Solution {
    public abstract int[] twoSum(int[] nums, int target);

    public void test(String nums, int target, String expected) {
        Assert.assertEquals(
                expected,
                ArrayUtils.array2Seq(
                        twoSum(ArrayUtils.intSeq2Array(nums), target)
                )
        );
    }
}
