package com.ust;

import java.util.Arrays;

/*Digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. The input
will be a non-negative integer.
Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2*/

public class SumOfDigits {
    public static int digital_root(int n) {
        int sum = n;

        while(sum > 9){
            int[] numbers = getDigitsArr(sum);
            sum = getSum(numbers);
        }

        return sum;

    }

    private static int[]  getDigitsArr(int number){
        char[] chars = (String.valueOf(number)).toCharArray();
        int[] digits = new int[chars.length];

        for(int i = 0; i < chars.length; i++){
            digits[i] = Integer.valueOf(String.valueOf(chars[i]));
            // Integer.valueOf(chars[i]) gives Unicode value
        }

        return digits;
    }

    private static int getSum(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        return total;
    }
}
