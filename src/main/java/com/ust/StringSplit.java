package com.ust;

/*Complete the solution so that it splits the string into pairs of two characters. If the string
  contains an odd number of characters then it should replace the missing second character
  of the final pair with an underscore ('_').
  StringSplit.solution("abc") // should return {"ab", "c_"}
  StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
*/
public class StringSplit {

    public static String[] solution(String s) {
        int pairsLength = (s.length() % 2 == 0) ? s.length() / 2 : s.length() / 2 + 1;
        String[] pairs = new String[(pairsLength)]; // 3
        int pairsIndex = 0;

        for (int i = 0; i < s.length(); i += 2) {

            pairs[pairsIndex] = s.charAt(i) +
                    ((i + 1 < s.length()) ?
                            String.valueOf(s.charAt(i + 1)) : "_");

            pairsIndex++;
        }
        return pairs;
    }
}
