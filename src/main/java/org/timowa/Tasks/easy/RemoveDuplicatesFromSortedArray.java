package org.timowa.Tasks.easy;


import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static int[] removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        List<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && !uniqueList.contains(nums[i])) {
                uniqueList.add(nums[i]);
            }
        }

        return uniqueList.stream().mapToInt(Integer::intValue).toArray();
    }
}
