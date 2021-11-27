package com.ust.string20common;

/* a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself.
A string of length n has n! permutation. */
public class AllPermutations {

    /*public static List<String> permutations(String str) {

        return null;
    }*/

    /* * A method exposed to client to calculate permutation of String in Java. */
    public static void perm(String input) {
        input = "abc";
        print(input, "");
    }

    static void print(String elementsToPermute, String sequenceToPrint) {
        System.out.println("-------------\n");
        if (elementsToPermute.isEmpty()) {
            System.out.print(sequenceToPrint + " ");
            System.out.println("LEFT STOPCONDITION\n");
            return;
        }
        for (int i = 0; i < elementsToPermute.length(); i++) {
            // Rest of the string after excluding the ith character
            String part1 = elementsToPermute.substring(0, i);
            int next = i + 1;
            String part2 = elementsToPermute.substring(next);
            String newElmtsToPermute = part1 + part2;

            String currLetter = String.valueOf(elementsToPermute.charAt(i));
            String newSeqToPrint = sequenceToPrint + currLetter;
            print(newElmtsToPermute, newSeqToPrint);
        }
    }
}
