package com.ust.string20common;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class FindDuplicatesWithCount {

    public static Map<Character, Integer> duplicates(String str){

        if(Objects.isNull(str) || str.isBlank() || str.length() < 2)
            return new HashMap<>();

        Map<Character, Integer> frequency = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            Character c = Character.toLowerCase(str.charAt(i));
            Integer count = frequency.get(c);

            if(count == null){
                frequency.put(c, 1);
            } else {
                frequency.put(c, ++count);
            }
        }

        Map<Character, Integer> duplicates = new HashMap<>();

        for(Character c : frequency.keySet()){
            int count = frequency.get(c);
            if(count >= 2){
                duplicates.put(c, count);
            }
        }

        return duplicates;
    }

}
