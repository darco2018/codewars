package com.ust.string20common;

import static org.junit.jupiter.api.Assertions.*;

class ReverseInPlaceTest {

    @org.junit.jupiter.api.Test
    void testOdd() {

        String str1 = "Bad";
        String reversed1 = "daB";
        String str2 = "sMile";
        String reversed2 = "eliMs";

        String actual = ReverseInPlace.reverse(str1);
        String actual2 = ReverseInPlace.reverse(str2);

        assertEquals(reversed1, actual);
        assertEquals(reversed2, actual2);
    }

    @org.junit.jupiter.api.Test
    void testEven() {

        assertEquals("kcaH", ReverseInPlace.reverse("Hack"));
        assertEquals("Ba", ReverseInPlace.reverse("aB"));
    }

    @org.junit.jupiter.api.Test
    void testEmpty() {

        assertEquals("", ReverseInPlace.reverse(""));
    }

    @org.junit.jupiter.api.Test
    void testSingle() {

        assertEquals("$", ReverseInPlace.reverse("$"));
    }

    @org.junit.jupiter.api.Test
    void testNull() {

        assertEquals(null, ReverseInPlace.reverse(null));
    }
}