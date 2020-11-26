package de.pandooor.codeWars.eightKyu.sumMixedArray;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
//        return firstSolution(mixed); // 0-2ms
        //Best Practice: 2-4ms
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();

    }

    private int firstSolution(List<?> mixed) {
        int sum = 0;
        for (int i = 0; i < mixed.size(); i++) {
            sum += Integer.parseInt(String.valueOf(mixed.get(i)));
        }
        return sum;
    }
}
