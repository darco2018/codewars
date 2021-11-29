package com.ust.string20common.recursion;

public class ReverseWordsRecursive {

    public static String reverseWordsRecursive(String string) {

        if(string == null)
            throw new IllegalArgumentException("String cannot be null");
        //string = "ab cd";
        String[] strArr = string.split(" ");

        if(strArr.length == 0)
            return string;

        String reversed = String.join(" ", reverse(strArr, 0,strArr.length - 1));
        return reversed;
    }

    private static String[] reverse(String[] words, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return words;
        }

        // swap
        String temp = words[leftIndex];
        words[leftIndex] = words[rightIndex];
        words[rightIndex] = temp;

        return reverse(words, ++leftIndex, --rightIndex);
    }
}
