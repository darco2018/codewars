package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterOccurenceTest {

    @Test
    void occurence() {

        assertEquals(2, CharacterOccurence.occurence('o', "Sohottt"));
        assertEquals(3, CharacterOccurence.occurence('t', "Sohottt"));
        assertEquals(1, CharacterOccurence.occurence('h', "Soho"));
        assertEquals(1, CharacterOccurence.occurence('s', "Soho"));
        assertEquals(1, CharacterOccurence.occurence('S', "Soho"));
        assertEquals(0, CharacterOccurence.occurence('w', "Soho"));
        assertEquals(0, CharacterOccurence.occurence('3', "Soho"));
    }
}