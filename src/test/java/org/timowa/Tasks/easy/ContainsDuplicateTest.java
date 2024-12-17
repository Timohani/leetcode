package org.timowa.Tasks.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.timowa.Tasks.easy.ContainsDuplicate.containsDuplicate;
import static org.timowa.Tasks.easy.ContainsDuplicate.containsDuplicateFast;

class ContainsDuplicateTest {
    @Test
    public void duplicateTestTrue() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,2,3,1}));
        Assertions.assertTrue(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        Assertions.assertTrue(containsDuplicate(new int[]{5,1,8,1,7}));
    }

    @Test
    public void duplicateTestFalse() {
        Assertions.assertFalse(containsDuplicate(new int[]{1,2,3,4}));
        Assertions.assertFalse(containsDuplicate(new int[]{1,52,79,3,4,69,2,12,91}));
        Assertions.assertFalse(containsDuplicate(new int[]{8,1,7}));
    }

    @Test
    public void duplicateTestTrueFast() {
        Assertions.assertTrue(containsDuplicateFast(new int[]{1,2,3,1}));
        Assertions.assertTrue(containsDuplicateFast(new int[]{1,1,1,3,3,4,3,2,4,2}));
        Assertions.assertTrue(containsDuplicateFast(new int[]{5,1,8,1,7}));
    }

    @Test
    public void duplicateTestFalseFast() {
        Assertions.assertFalse(containsDuplicateFast(new int[]{1,2,3,4}));
        Assertions.assertFalse(containsDuplicateFast(new int[]{1,52,79,3,4,69,2,12,91}));
        Assertions.assertFalse(containsDuplicateFast(new int[]{8,1,7}));
    }

    @Test
    public void checkTimeOfMethods() {
        var test = new ContainsDuplicateTest();

        long timeNormal = System.currentTimeMillis();
        test.duplicateTestTrue();
        test.duplicateTestFalse();
        long timeNormalBetween = System.currentTimeMillis() - timeNormal;

        long timeFast = System.currentTimeMillis();
        test.duplicateTestTrueFast();
        test.duplicateTestFalseFast();
        long timeFastBetween = System.currentTimeMillis() - timeFast;

        System.out.println("Normal method speed = " + timeNormalBetween); // 4 millis
        System.out.println("Fast method speed = " + timeFastBetween); // 0 millis    :)

        Assertions.assertTrue(timeFastBetween < timeNormalBetween);
    }
}