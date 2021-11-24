package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsOnlyTest {

    @Test
    void isOnlyDigits() {
        assertTrue( true, "1536");
    }

    @Test
    void isNotOnlyDigits() {
        assertTrue( true, "1536a");
        assertTrue( true, "b1536");
        assertTrue( true, "1C536");
    }
}