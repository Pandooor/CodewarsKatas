package de.pandooor.codeWars.eightKyu.beginnerReduceButGrow;


import java.util.stream.IntStream;

public class Kata {

    public static int grow(int[] x) {
//        Alternative one line approach: 1-2ms
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
//        Already best Practice: 0-1ms
//        return firstSolution(x);
    }

    private static int firstSolution(int[] x) {
        int product = 1;
        for (int i = 0; i < x.length; i++) {
            product *= x[i];
        }
        return product;
    }
}