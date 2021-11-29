package com.ust.string20common;

import com.ust.string20common.recursion.ReverseStringRecursive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringRecursiveTest {

    // How to catch exceptions
    //JUnit 4 ----> @Test(expected = NullPointerException.class)
    @Test
    void shouldThrowException() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ReverseStringRecursive.reverseRecursive(null)); // interface  org.junit.jupiter.api.function.Executable
                                                                           // has a run() method to implement?

        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("String cannot be null"));

        ///////////////////////////////////////////////

        try {
            ReverseStringRecursive.reverseRecursive(null);
            fail("Should have thrown an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void shouldReverseStringOk() {

        assertTrue("".equals(ReverseStringRecursive.reverseRecursive("")));
        assertTrue("a".equals(ReverseStringRecursive.reverseRecursive("a")));
        assertTrue(" ".equals(ReverseStringRecursive.reverseRecursive(" ")));
        assertTrue("aa".equals(ReverseStringRecursive.reverseRecursive("aa")));

        assertTrue("ba".equals(ReverseStringRecursive.reverseRecursive("ab")));
        assertTrue("cba".equals(ReverseStringRecursive.reverseRecursive("abc")));
        assertTrue("5432 1".equals(ReverseStringRecursive.reverseRecursive("1 2345")));
    }
}