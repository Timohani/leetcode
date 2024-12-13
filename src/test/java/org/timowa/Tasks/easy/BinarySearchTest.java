package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.BinarySearch.search;

class BinarySearchTest {

    @Test
    public void searchTest() {
        Assertions.assertEquals(-1, search(new int[]{-1,0,3,5,9,12}, 4));
        Assertions.assertEquals(4, search(new int[]{-1,0,3,5,9,12}, 9));
        Assertions.assertEquals(5, search(new int[]{4,15,24,33,46,54,197}, 54));
    }
}