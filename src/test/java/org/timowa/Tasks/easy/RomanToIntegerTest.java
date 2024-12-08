package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.RomanToInteger.romanToInt;

class RomanToIntegerTest {
    @Test
    public void romanToIntTest() {
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"));
        Assertions.assertEquals(4, romanToInt("IV"));
        Assertions.assertEquals(2090, romanToInt("MMXC"));
        Assertions.assertEquals(3023, romanToInt("MMMXXIII"));
        Assertions.assertEquals(8, romanToInt("VIII"));
    }
}