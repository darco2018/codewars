package com.ust.string20common;

public class ReverseInPlace {

    public static String reverse(String str) {

        if (str == null) {
            return str;
        }
        char[] charArray = str.toCharArray();

        int rightIndex = (charArray.length - 1);
        int leftIndex = 0;

        while (leftIndex < rightIndex) {

            char temp = charArray[leftIndex];
            charArray[leftIndex] = charArray[rightIndex];
            charArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;

        }

        return String.valueOf(charArray);
    }

}
