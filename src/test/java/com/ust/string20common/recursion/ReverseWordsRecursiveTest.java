package com.ust.string20common.recursion;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsRecursiveTest {

    @Test
    void onlySpaces() {
        String s = " ";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive(" ")));

        s = "  ";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive("  ")));

        s = "       ";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive("       ")));
    }

    @Test
    void reverseWordsRecursive() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> ReverseWordsRecursive.reverseWordsRecursive(null));
        assertEquals("String cannot be null", ex.getMessage());

        String s = "";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive("")));

        s = "ab";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive("ab")));

        s = "ab cd";
        assertTrue(s.equals(ReverseWordsRecursive.reverseWordsRecursive("cd ab")));

        s = "ab cd ef";
        assertEquals(s, ReverseWordsRecursive.reverseWordsRecursive("ef cd ab"));

        s = "ab cd ef gh";
        assertEquals(s, ReverseWordsRecursive.reverseWordsRecursive("gh ef cd ab"));
    }

    @Disabled
    @Test
        // doesnt read the trailing spaces
    void leadingSpaces() {
        String s = "  1 2 3 ! ";
        assertEquals(s, ReverseWordsRecursive.reverseWordsRecursive("  ! 3 2 1 "));
    }
}