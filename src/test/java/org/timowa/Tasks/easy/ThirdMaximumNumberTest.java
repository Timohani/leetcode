package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.ThirdMaximumNumber.thirdMax;

class ThirdMaximumNumberTest {

    @Test
    public void thirdMaxTest() {
        Assertions.assertEquals(1, thirdMax(new int[]{3,2,1}));
        Assertions.assertEquals(2, thirdMax(new int[]{2,1}));
        Assertions.assertEquals(2, thirdMax(new int[]{1,2}));
        Assertions.assertEquals(2, thirdMax(new int[]{1,2,2,7,3}));
    }
}