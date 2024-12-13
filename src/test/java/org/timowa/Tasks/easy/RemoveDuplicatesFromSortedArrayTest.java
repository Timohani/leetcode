package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.RemoveDuplicatesFromSortedArray.removeDuplicates;


class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicatesTest() {
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4}, removeDuplicates(new int[]{0,1,1,1,2,2,3,4}));
    }

    @Test
    public void removeDuplicatesTestWithAllDuplicates() {
        Assertions.assertArrayEquals(new int[]{1}, removeDuplicates(new int[]{1,1,1,1,1}));
    }

    @Test
    public void removeDuplicatesTestWithNoDuplicates() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5}, removeDuplicates(new int[]{1,2,3,4,5}));
    }

    @Test
    public void removeDuplicatesTestWithEmptyArray() {
        Assertions.assertArrayEquals(new int[]{}, removeDuplicates(new int[]{}));
    }
}