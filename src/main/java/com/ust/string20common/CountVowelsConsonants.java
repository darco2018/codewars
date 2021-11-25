package com.ust.string20common;


import java.util.Set;

public class CountVowelsConsonants {

    /**
     * returns # of vwels at arr[0] and consonants at arr[1]
     */
    public static int[] countVowelsConsonants(String str) {
        if (str == null)
            return new int[]{0, 0};

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int startUnicodeLowercase = 97;
        int endUnicodeLowercase = 122;

        int vowelsCounter = 0;
        int consonantsCounter = 0;

        for (Character ch : str.toLowerCase().toCharArray()) {
            if (ch >= startUnicodeLowercase && ch <= endUnicodeLowercase) {
                if (vowels.contains(ch))
                    vowelsCounter++;
                else
                    consonantsCounter++;
            }

        }

        return new int[]{vowelsCounter, consonantsCounter};

    }


}
