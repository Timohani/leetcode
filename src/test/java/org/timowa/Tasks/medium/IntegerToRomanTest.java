package org.timowa.Tasks.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.medium.IntegerToRoman.intToRoman;


class IntegerToRomanTest {
    @Test
    public void intToRomanTest() {
        Assertions.assertEquals("MMMDCCXLIX", intToRoman(3749));
        Assertions.assertEquals("LVIII", intToRoman(58));
        Assertions.assertEquals("IV", intToRoman(4));
    }
}