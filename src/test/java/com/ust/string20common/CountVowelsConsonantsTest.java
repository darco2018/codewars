package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsConsonantsTest {

    @Test
    void countVowelsConsonants() {

        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.countVowelsConsonants(null));
        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.countVowelsConsonants(""));
        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.countVowelsConsonants(" "));
        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.countVowelsConsonants("?"));
        assertArrayEquals(new int[]{0,1}, CountVowelsConsonants.countVowelsConsonants("F"));
        assertArrayEquals(new int[]{1,0}, CountVowelsConsonants.countVowelsConsonants("U"));

        assertArrayEquals(new int[]{2,3}, CountVowelsConsonants.countVowelsConsonants("abcde"));
        assertArrayEquals(new int[]{5,3}, CountVowelsConsonants.countVowelsConsonants("oabcdeoi"));
        assertArrayEquals(new int[]{2,3}, CountVowelsConsonants.countVowelsConsonants("ABcde"));
        assertArrayEquals(new int[]{2,3}, CountVowelsConsonants.countVowelsConsonants("&abcde!@#"));
        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.countVowelsConsonants("$%^&&*"));
        assertArrayEquals(new int[]{0,1}, CountVowelsConsonants.countVowelsConsonants("$%^W&&*"));
    }
}