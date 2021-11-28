package com.ust.string20common;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static List<String> permutations(String input) {
        if (input == null)
            return List.of();
        return permutationsInternal(input, "", new ArrayList<>());
    }

    static List<String> permutationsInternal(String elementsToPermute, String permuted, List<String> permutations) {

        if (elementsToPermute.isEmpty()) {
            permutations.add(permuted);
            return permutations;
        }
        // decrease left input arg, increase right input by shifting ith char to the right
        for (int i = 0; i < elementsToPermute.length(); i++) {

            String excludedLetter = String.valueOf(elementsToPermute.charAt(i));
            String stringBefore_i = elementsToPermute.substring(0, i);
            String stringAfter_i = elementsToPermute.substring(i+1);
            String elementsWithout_i = stringBefore_i + stringAfter_i;

            String permutedWith_i = permuted + excludedLetter;
            permutationsInternal(elementsWithout_i, permutedWith_i, permutations);
        }

        return permutations;
    }
}
