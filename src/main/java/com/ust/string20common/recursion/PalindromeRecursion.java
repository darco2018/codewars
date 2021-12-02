package com.ust.string20common.recursion;

public class PalindromeRecursion {

    public static boolean isPalindrome(String str) {

        if (str.length() < 2) {
            return true;
        }
        return isPalindromeInternal(str);
    }

    private static boolean isPalindromeInternal(String str) {

        if (str.isEmpty() || str.length() == 1)
            return true;

        int lastIdx = str.length() - 1;
        if (str.charAt(0) == str.charAt(lastIdx)) {
            return isPalindromeInternal(str.substring(0 + 1, lastIdx));
        } else {
            return false;
        }
    }
}
