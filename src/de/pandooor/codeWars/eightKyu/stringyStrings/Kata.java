package de.pandooor.codeWars.eightKyu.stringyStrings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String stringy(int size) {
//        alternative solution in one line: 13-17ms
        return IntStream.rangeClosed(1, size)
                .map(i -> i % 2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

//        first solution already best practice 11-12ms
//        return firstSolution(size);
    }

    private static String firstSolution(int size) {
        StringBuilder answer = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                answer.append(1);
            } else {
                answer.append(0);
            }
        }
        return answer.toString();
    }
}