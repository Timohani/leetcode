package org.timowa.Tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearing {
    public static int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        int target = arr.length / 4;
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > target) {
                return num;
            }
        }
        return -1;
    }
}
