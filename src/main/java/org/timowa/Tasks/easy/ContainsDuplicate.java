package org.timowa.Tasks.easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : nums) {
            if (duplicate.contains(num)) {
                return true;
            } else {
                duplicate.add(num);
            }
        }
        return false;
    }

    public static boolean containsDuplicateFast(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : nums) {
            if (!duplicate.add(num)) {
                return true;
            }
        }
        return false;
    }
}
