package de.liebig.codeWars.eightKyu.sumOfPositive;

import java.util.Arrays;

public class Positive {
    public static int sum(int[] arr) {
//        return firstSolution(arr); //0-1ms
        //Best Practice: 2-3ms
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    private static int firstSolution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
