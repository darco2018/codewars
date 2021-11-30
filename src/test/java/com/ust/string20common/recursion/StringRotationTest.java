package com.ust.string20common.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    @Test
    void isRotation_EdgeCases() {

        assertThrows(IllegalArgumentException.class, ()->StringRotation.isRotation(null, "w"));
        assertThrows(IllegalArgumentException.class, ()->StringRotation.isRotation(null, null));
        assertThrows(IllegalArgumentException.class, ()->StringRotation.isRotation("w", null));

        assertTrue(StringRotation.isRotation("", ""));
        assertTrue(StringRotation.isRotation(" ", " "));

        assertTrue(StringRotation.isRotation("w", "w"));
        assertTrue(StringRotation.isRotation("qqqq", "qqqq"));

        assertFalse(StringRotation.isRotation("IndiaUSAEngland", "IndiaEnglandUSA"));
        assertFalse(StringRotation.isRotation("USin", "niUS"));
    }

    @Test
    void isNotRotation() {
        assertFalse(StringRotation.isRotation("length1", "length12"));
        assertFalse(StringRotation.isRotation("IndiaUSAEngland", "IndiaEnglandUSA"));
        assertFalse(StringRotation.isRotation("USin", "niUS"));
        assertFalse(StringRotation.isRotation("USin", "icUS"));
        assertFalse(StringRotation.isRotation("USin", "UniS"));
    }

    @Test
    void isRotation() {
        assertTrue(StringRotation.isRotation("abc", "abc"));
        assertTrue(StringRotation.isRotation("ab", "ba"));
        assertTrue(StringRotation.isRotation("USin", "inUS"));
        assertTrue(StringRotation.isRotation("IndiaUSAEngland", "USAEnglandIndia"));

    }
}