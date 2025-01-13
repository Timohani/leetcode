package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.timowa.Tasks.easy.NumberOfSegmentsInAString.countSegments;

class NumberOfSegmentsInAStringTest {

    @Test
    void countSegmentsTest() {
        assertEquals(5, countSegments("Hello, my name is John"));
        assertEquals(1, countSegments("Hello"));
    }

}