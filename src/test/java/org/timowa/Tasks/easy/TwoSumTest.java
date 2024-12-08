package org.timowa.Tasks.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.TwoSum.twoSum;

class TwoSumTest {
    @Test
    public void twoSumTest() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{3,2,4}, 6));
        Assertions.assertNull(twoSum(new int[]{1, 7, 29}, 12));
        Assertions.assertArrayEquals(new int[]{0,2}, twoSum(new int[]{8,94,52,7}, 60));
    }
}