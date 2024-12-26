package org.timowa.Tasks.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.ElementAppearing.findSpecialInteger;

class ElementAppearingTest {

    @Test
    public void findSpecialIntegerTest() {
        Assertions.assertEquals(6, findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
        Assertions.assertEquals(1, findSpecialInteger(new int[]{1,1}));
    }
}