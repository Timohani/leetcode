package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertANumberToHexadecimalTest {

    @Test
    void toHexTest() {
        assertEquals("1a", ConvertANumberToHexadecimal.toHex(26));
    }

}