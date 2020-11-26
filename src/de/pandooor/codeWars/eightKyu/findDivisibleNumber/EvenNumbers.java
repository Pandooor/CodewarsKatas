package de.pandooor.codeWars.eightKyu.findDivisibleNumber;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
//        Alternative Approach using more lines: 1-2ms
//        return alternativeApproach(numbers, divider);
//        Already best practice: 4-5ms
        return Arrays.stream(numbers).filter(x -> x % divider == 0).toArray();
    }

    private static int[] alternativeApproach(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers){
            if (number % divider == 0){
                count ++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers){
            if (number % divider == 0){
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}