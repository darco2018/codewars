package com.ust.string20common;

public class CharacterOccurence {

    public  static int occurence(char c, String str){

        int counter = 0;

        for(Character ch : str.toLowerCase().toCharArray()){
            //if(ch.equals(Character.toLowerCase(c)))
            if(ch == Character.toLowerCase(c))
                counter++;
        }

        return counter;
    }
}
