package org.timowa.Tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    @Test
    public void palindromeTrueTest() {
        Assertions.assertTrue(PalindromeNumber.isPalindrome(121));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(53235));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(91466419));
    }

    @Test
    public void palindromeFalseTest() {
        Assertions.assertFalse(PalindromeNumber.isPalindrome(122));
        Assertions.assertFalse(PalindromeNumber.isPalindrome(158481));
        Assertions.assertFalse(PalindromeNumber.isPalindrome(786415));
    }

}