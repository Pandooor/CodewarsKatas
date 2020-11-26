package de.liebig.codeWars.eightKyu.firstNonConsecutiveNumber;

import java.util.stream.IntStream;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
//        Alternative one line approach: 2-4ms
        return IntStream.range(1, array.length).filter(i -> array[i-1] != array[i]-1)
                .mapToObj(x -> Integer.valueOf(array[x])).findFirst().orElse(null);
//        Best Practice: 0-1ms
//        return firstSolution(array);
    }

    private static Integer firstSolution(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return Integer.valueOf(array[i]);
            }
        }
        return null;
    }
}
