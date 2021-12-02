package com.ust.string20common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ByteArrToStringTest {

    @Test
    void byteArrToString() {

       // assertEquals("é", ByteArrToString.byteArrToString("é".getBytes())); //
        assertTrue(ByteArrToString.practice());
    }
}