package de.pandooor.codeWars.eightKyu.amountOfPoints;

public class TotalPoints {

    public static int points(String[] games) {
//        Best Practice: 0-1ms
        int sum = 0;

        for (String s : games) {
            char x = s.charAt(0),
                    y = s.charAt(2);

            sum += x > y ? 3 : x == y ? 1 : 0;
        }

        return sum;
//        return firstSolution(games); // 1-2ms
    }

    private static int firstSolution(String[] games) {
        int points = 0;
        for (String game : games) {
            String[] score = game.split(":");
            if (score[0].equals(score[1])) {
                points++;
            } else if (Integer.parseInt(score[0]) > Integer.parseInt(score[1])) {
                points += 3;
            }
        }
        return points;
    }
}