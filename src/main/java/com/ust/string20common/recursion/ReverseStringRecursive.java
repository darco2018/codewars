package com.ust.string20common.recursion;

public class ReverseStringRecursive {

    public static
    String reverseRecursive(String str){
        return reverseInternal(str);
    }

    private static String reverseInternal(String string) {

        if(string == null){
            throw new IllegalArgumentException("String cannot be null");
        }

        if (string.isEmpty()){
            return "";
        }

        String lastChar = string.substring(string.length() -1);
        String remaining = string.substring(0,string.length() -1);
        return lastChar + reverseInternal(remaining);
    }
}
