package com.ust.string20common;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPermutationsTest {

    @Test
    void permutations() {

        assertIterableEquals(List.of("s"), AllPermutations.permutations("s"));

        assertIterableEquals(List.of("op","po"), AllPermutations.permutations("op"));

        assertIterableEquals(List.of("ABC", "ACB", "BAC", "BCA", "CBA", "CAB" ),
                AllPermutations.permutations("ABC"));
    }
}