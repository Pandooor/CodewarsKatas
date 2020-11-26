package de.liebig.codeWars.sevenKyu.arrayLeadersArraySeries3;

import java.util.*;

public class Solution {
    public static List arrayLeaders(int[] numbers) {
//        Best Practice: 1-2ms
        List<Integer> ary = new ArrayList<>();
        for (int i = numbers.length - 1, sum = 0; i >= 0; i--) {
            if (numbers[i] > sum) ary.add(0, numbers[i]);
            sum += numbers[i];
        }
        return ary;
//        First Solution: 1-2ms
//        return firstSolution(numbers);
    }

    private static List<Integer> firstSolution(int[] numbers) {
        int vgl = 0;
        int sum;
        List<Integer> greaters = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                if (numbers[i] > 0) {
                    greaters.add(numbers[i]);
                    break;
                }
            }
            vgl = numbers[i];
            sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
            }
            if (vgl > sum) {
                greaters.add(vgl);
            }
        }
        return greaters;
    }
}