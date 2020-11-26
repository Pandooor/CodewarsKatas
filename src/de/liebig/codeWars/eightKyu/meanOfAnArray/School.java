package de.liebig.codeWars.eightKyu.meanOfAnArray;

import java.util.Arrays;

public class School {
    public static int getAverage(int[] marks) {
//        Best Practice: 0-1ms
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;

//        return firstSolution(marks); //2ms
    }

    private static int firstSolution(int[] marks) {
        return (int) (Arrays.stream(marks).sum() / marks.length);
    }
}