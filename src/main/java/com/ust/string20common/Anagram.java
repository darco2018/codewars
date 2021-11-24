package com.ust.string20common;

import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {

        if (Objects.isNull(s1) || Objects.isNull(s2) || s1.length() != s2.length())
            return false;

        StringBuilder sb = new StringBuilder(s1.toLowerCase());

        for (Character ch : s2.toLowerCase().toCharArray()) {
            int index = sb.indexOf(String.valueOf(ch));
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }

        return sb.length() == 0;
    }

    private static boolean method_2(String s1, String s2) {
        char[] chArr1 = s1.toLowerCase().toCharArray();
        Arrays.sort(chArr1);
        char[] chArr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chArr2);

        return Arrays.equals(chArr1, chArr2);
    }

    private static boolean method_1(String s1, String s2) {


        Map<Character, Integer> letters = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            Character ch = Character.toLowerCase(c);
            Integer count = letters.get(ch);

            if (count == null) {
                letters.put(ch, 1);
            } else {
                letters.put(ch, ++count);
            }
        }

        for (Character c : s2.toCharArray()) {
            Character ch = Character.toLowerCase(c);
            Integer count = letters.get(ch);

            if (count == null || count < 1) {
                return false;
            } else {
                letters.put(ch, --count);
            }
        }

        return true;
    }
}
