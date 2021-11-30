package com.ust.string20common.recursion;

import java.util.Objects;

public class StringRotation {

    public static boolean isRotation(String str1, String str2) { // "ab", "ba"

        if (str1 == null || Objects.isNull(str2))
            throw new IllegalArgumentException();

        if (str1.length() != str2.length())
            return false;

        if (str1.equals(str2))
            return true;

        //return isRotationSimple(str1, str2);


        return isRotationInternalRecursive(str1, "", str2);
    }

    private static boolean isRotationSimple(String original, String rotation) {

        String concatenated = original + original;
        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }
        return false;

    }

    private static boolean isRotationInternalRecursive(String original, String swapped, String other) {

        if (original.equals(swapped))
            return false;

        // change on 1st pass only
        swapped = swapped.isEmpty() ? original : swapped;

        int lastIndex = swapped.length() - 1;

        String rotated = swapped.charAt(lastIndex) + swapped.substring(0, lastIndex);

        return other.equals(rotated) ? true : isRotationInternalRecursive(original, rotated, other);
    }

}
