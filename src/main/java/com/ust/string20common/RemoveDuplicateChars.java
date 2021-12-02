package com.ust.string20common;

import java.util.*;

public class RemoveDuplicateChars {

    public static String removeDuplicateChars(String str) {
        if(str == null){
            throw new IllegalArgumentException("String is null");
        }
        if (str.length() < 2) {
            return str;
        }
        return removeDuplicateCharsInternal(str.toLowerCase());
    }

    private static String removeDuplicateCharsInternal(String str) {

        Set<Character> candidateStr = new LinkedHashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);
            if(duplicates.contains(ch)){
                continue;
            } else if(candidateStr.contains(ch)) {
                candidateStr.remove(ch);
                duplicates.add(ch);
            } else {
                candidateStr.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
                for(Character c : candidateStr){
                    sb.append(c);
                }

        System.out.println(sb);
        return sb.toString();
    }
}
