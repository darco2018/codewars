package com.ust;

import java.util.List;
import java.util.LinkedList;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<Integer> digitsList = convertIntegerIntoSortedDigitsList(num);
        return convertListToInteger(digitsList);
    }

    // it would be better to split it into 2 methods: 1) conversion 2) sort
    private static List<Integer> convertIntegerIntoSortedDigitsList(int number) {
        List<Integer> digits = new LinkedList<>();

        while (number / 10 > 0) {
            int whole = number / 10;
            int mod = number % 10;
            insertDigit(digits, mod);
            number = whole;
        }
        insertDigit(digits, number);
        return digits;
    }

    private static void insertDigit(List<Integer> list, Integer num) {
        // O(n2) insertion sort: each new element is compared with those already sorted
        // and placed in a temporarily correct position
        // implement merge sort for O(n log n) or use
        // Collections.sort(List<T> list, Comparator<? super T> c)
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (num >= current) {
                list.add(i, num);
                return;
            }
        }
        list.add(list.size(), num);
    }

    private static int convertListToInteger(List<Integer> ints) {
        String numberAsString = "";
        for (Integer num : ints) {
            numberAsString += String.valueOf(num);
        }

        return Integer.valueOf(numberAsString);
    }

}
