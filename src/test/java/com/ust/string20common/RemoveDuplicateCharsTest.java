package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharsTest {

    @Test
    void removesDuplicates(){
        assertEquals("", RemoveDuplicateChars.removeDuplicateChars(""));
        assertEquals("a", RemoveDuplicateChars.removeDuplicateChars("a"));
        assertEquals("ab", RemoveDuplicateChars.removeDuplicateChars("ab"));
        assertEquals("", RemoveDuplicateChars.removeDuplicateChars("aa"));
        assertEquals("w", RemoveDuplicateChars.removeDuplicateChars("awa"));
        assertEquals("bw", RemoveDuplicateChars.removeDuplicateChars("bawa"));
        assertEquals("w", RemoveDuplicateChars.removeDuplicateChars("awaa"));

        assertEquals("f", RemoveDuplicateChars.removeDuplicateChars("babaf"));
        assertEquals("cx", RemoveDuplicateChars.removeDuplicateChars("cghxoogh"));
         assertEquals("roi", RemoveDuplicateChars.removeDuplicateChars("pppppppproi"));
        assertEquals("xyf", RemoveDuplicateChars.removeDuplicateChars("babXYabf"));

    }

}