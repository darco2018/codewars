package com.ust.string20common;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPermutationsTest {

    private static long factorial(long n) {
        if (n == 1 || n == 0) return 1;

        return (n) * factorial(n - 1);
    }

    @Test
    void permutations() {
        String str = ""; // empty
        List<String> perms = StringPermutations.permutations(str);
        assertEquals(factorial(str.length()), perms.size());
        assertIterableEquals(List.of(""), perms);

        str = null;
        perms = StringPermutations.permutations(str);
        assertIterableEquals(List.of(), perms);

        str = "s";
        perms = StringPermutations.permutations(str);
        assertEquals(factorial(str.length()), perms.size());
        assertIterableEquals(List.of("s"), perms);

        str = "op";
        perms = StringPermutations.permutations(str);
        assertEquals(factorial(str.length()), perms.size());
        assertIterableEquals(List.of("op", "po"), StringPermutations.permutations(str));

        str = "ABC";
        perms = StringPermutations.permutations(str);
        assertEquals(factorial(str.length()), perms.size());
        assertIterableEquals(List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"),
                StringPermutations.permutations(str));
    }
}