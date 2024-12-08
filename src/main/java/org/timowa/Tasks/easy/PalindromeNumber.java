package org.timowa.Tasks.easy;


public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversedNum = 0, remainder;
        int originalNum = x;

        while (x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }
        return originalNum == reversedNum;
    }
}
