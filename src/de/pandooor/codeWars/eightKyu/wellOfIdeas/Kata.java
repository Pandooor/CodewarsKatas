package de.pandooor.codeWars.eightKyu.wellOfIdeas;

import java.util.Arrays;

public class Kata {

    public static String well(String[] x) {
//        Alternative usage of streams: 1-2ms
        long count = Arrays.stream(x).filter(i -> i.equals("good")).count();
        return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
//        First Solution is close to best practice: 0-1ms
//        return firstSolution(x);
    }

    private static String firstSolution(String[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("good")) {
                count++;
            }
        }
        if (count == 0) {
            return "Fail!";
        } else if (count < 3) {
            return "Publish!";
        } else {
            return "I smell a series!";
        }
    }
}