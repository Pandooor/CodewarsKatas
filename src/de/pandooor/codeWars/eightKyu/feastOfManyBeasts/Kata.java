package de.pandooor.codeWars.eightKyu.feastOfManyBeasts;

public class Kata {

    public static boolean feast(String beast, String dish) {
//        Best practice in one line: 0-1ms
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
//        First Solution: 0-1ms
//        return firstSolution(beast, dish);
    }

    private static boolean firstSolution(String beast, String dish) {
        if (beast.charAt(0) != dish.charAt(0)) {
            return false;
        }
        if (beast.charAt(beast.length() - 1) != dish.charAt(dish.length() - 1)) {

            return false;
        }
        return true;
    }
}