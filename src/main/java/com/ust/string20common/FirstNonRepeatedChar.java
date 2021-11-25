package com.ust.string20common;

import java.util.*;

public class FirstNonRepeatedChar {

    public static Character firstNonRepeatedChar(String string) {
        return firstNonRepeatedChar_1(string); // firstNonRepeatedChar_2(string);
    }


    public static Character firstNonRepeatedChar_1(String string) {

        if (string == null || string.isEmpty())
            return null;

        Set<Character> repeated = new HashSet<>();
        List<Character> candidates = new ArrayList<>();
        String word = string.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (repeated.contains(letter))
                continue;

            if (candidates.contains(letter)) {
                candidates.remove((Character) letter);
                repeated.add(letter);
            } else {
                candidates.add(letter);
            }
        }
        return candidates.isEmpty() ? null : candidates.get(0);

    }

    public static Character firstNonRepeatedChar_2(String string) {
        if (string == null || string.isEmpty())
            return null;

        String str = string.toLowerCase();
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.containsKey(ch) ? counts.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;

    }
}
