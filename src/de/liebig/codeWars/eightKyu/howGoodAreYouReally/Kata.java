package de.liebig.codeWars.eightKyu.howGoodAreYouReally;

import java.util.Arrays;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        Alternative Approach with more lines but faster: 0-1ms
//        return alternativeApproach(classPoints, yourPoints);

        //first Solution kind of Best Practice: 2-3ms
        return yourPoints > Arrays.stream(classPoints).average().getAsDouble();
    }

    private static boolean alternativeApproach(int[] classPoints, int yourPoints) {
        long avg = 0;

        for (int i : classPoints)
        {
            avg += i;
        }

        avg /= classPoints.length;

        if (yourPoints > avg) return true;
        return false;
    }
}