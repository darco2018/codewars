package com.ust.string20common;

public class DigitsOnly {

    public static boolean isOnlyDigits(String str){

        for(Character ch : str.toCharArray()){
            if(! Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
