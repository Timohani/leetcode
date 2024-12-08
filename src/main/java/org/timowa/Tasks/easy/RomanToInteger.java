package org.timowa.Tasks.easy;

import java.lang.reflect.Array;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[s.length()];

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    Array.set(ints, i, 1);
                    break;
                case 'V':
                    Array.set(ints, i, 5);
                    break;
                case 'X':
                    Array.set(ints, i, 10);
                    break;
                case 'L':
                    Array.set(ints, i, 50);
                    break;
                case 'C':
                    Array.set(ints, i, 100);
                    break;
                case 'D':
                    Array.set(ints, i, 500);
                    break;
                case 'M':
                    Array.set(ints, i, 1000);
                    break;
            }
        }
        int result = 0;
        int reminded = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                result = ints[i];
            } else {
                if (ints[i] <= reminded) {
                    result += ints[i];
                } else {
                    result += ints[i] - reminded;
                    result -= reminded;
                }
            }
            reminded = ints[i];
        }
        return result;
    }
}
