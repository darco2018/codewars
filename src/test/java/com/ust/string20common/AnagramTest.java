package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram("", ""));
        assertTrue(Anagram.isAnagram("o", "o"));
        assertTrue(Anagram.isAnagram("wo", "ow"));
        assertTrue(Anagram.isAnagram("stop", "post"));
        assertTrue(Anagram.isAnagram("smile", "ilsme"));
    }

    @Test
    void isAnagram_CaseInsensitive() {
        assertTrue(Anagram.isAnagram("sMile", "iLsme"));
    }

    @Test
    void isNotAnagram() {

        assertFalse(Anagram.isAnagram("co", "ow"));
        assertFalse(Anagram.isAnagram("pos", "pot"));
        assertFalse(Anagram.isAnagram("smile", "ilsmy"));
        assertFalse(Anagram.isAnagram("ccc", "ccccccc"));
    }

    @Test
    void isNotAnagram_CaseInsensitive() {
        assertFalse(Anagram.isAnagram("smilE", "ilsmY"));
    }
    @Test
    void isNotAnagram_Null() {
        assertFalse(Anagram.isAnagram("co", null));
        assertFalse(Anagram.isAnagram(null, "co"));
        assertFalse(Anagram.isAnagram(null, null));
    }
}