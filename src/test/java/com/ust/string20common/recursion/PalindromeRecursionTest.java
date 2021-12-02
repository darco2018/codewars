package com.ust.string20common.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeRecursionTest {

    @Test
    void isPalindrome() {

        assertTrue( PalindromeRecursion.isPalindrome(""));
        assertTrue( PalindromeRecursion.isPalindrome("s"));
        assertTrue( PalindromeRecursion.isPalindrome("dad"));
        assertTrue( PalindromeRecursion.isPalindrome("ccc"));
        assertTrue( PalindromeRecursion.isPalindrome("abba"));
        assertTrue( PalindromeRecursion.isPalindrome("xabbax"));
    }
    @Test
    void isNotPalindrome() {

        assertFalse( PalindromeRecursion.isPalindrome("qs"));
        assertFalse( PalindromeRecursion.isPalindrome("sq"));
        assertFalse( PalindromeRecursion.isPalindrome("sqq"));
        assertFalse( PalindromeRecursion.isPalindrome("qqs"));
        assertFalse( PalindromeRecursion.isPalindrome("abbv"));
        assertFalse( PalindromeRecursion.isPalindrome("abvb"));
    }
}