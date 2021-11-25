package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatedCharTest {

    @Test
    void firstNonRepeated_TwoLetters() {
        assertEquals('t', FirstNonRepeatedChar.firstNonRepeatedChar("RoRoRt"));
        assertEquals('a', FirstNonRepeatedChar.firstNonRepeatedChar("ak"));
        assertEquals(null, FirstNonRepeatedChar.firstNonRepeatedChar("aa"));
        assertEquals('r', FirstNonRepeatedChar.firstNonRepeatedChar("ooR")); // last
        assertEquals('t', FirstNonRepeatedChar.firstNonRepeatedChar("toR"));
        assertEquals('r', FirstNonRepeatedChar.firstNonRepeatedChar("oRo")); // last but one
        assertEquals('r', FirstNonRepeatedChar.firstNonRepeatedChar("oRo"));
    }

    @Test
    void firstNonRepeated() {
        assertEquals(' ', FirstNonRepeatedChar.firstNonRepeatedChar(" "));
        assertEquals('f', FirstNonRepeatedChar.firstNonRepeatedChar("F"));
        assertEquals('r', FirstNonRepeatedChar.firstNonRepeatedChar("Roo"));
        assertEquals('i', FirstNonRepeatedChar.firstNonRepeatedChar("Simons"));
        assertEquals('m', FirstNonRepeatedChar.firstNonRepeatedChar("Simonis"));
        assertEquals('o', FirstNonRepeatedChar.firstNonRepeatedChar("Simonismy"));
        assertEquals('e', FirstNonRepeatedChar.firstNonRepeatedChar("WwWeWO"));

    }

    @Test
    void firstNonRepeated_returnsNull() {
        assertEquals(null, FirstNonRepeatedChar.firstNonRepeatedChar(null));
        assertEquals(null, FirstNonRepeatedChar.firstNonRepeatedChar(""));

        assertEquals(null, FirstNonRepeatedChar.firstNonRepeatedChar("44444444"));
    }




}