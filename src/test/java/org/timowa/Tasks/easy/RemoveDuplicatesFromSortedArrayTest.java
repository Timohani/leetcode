package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.RemoveDuplicatesFromSortedArray.removeDuplicates;


class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicatesTest() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,4}));
    }
}