package de.liebig.codeWars.eightKyu.rockPaperScissors;

public class Kata {
    public static String rps(String p1, String p2) {
        //Best pracice: 23-31ms
        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";

//        return firstSolution(p1, p2); //0-1ms
    }

    private static String firstSolution(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        switch (p1) {
            case "rock":
                if (p2.equals("scissors")) {
                    return "Player 1 won!";
                } else {
                    return "Player 2 won!";
                }
            case "paper":
                if (p2.equals("rock")) {
                    return "Player 1 won!";
                } else {
                    return "Player 2 won!";
                }
            case "scissors":
                if (p2.equals("paper")) {
                    return "Player 1 won!";
                } else {
                    return "Player 2 won!";
                }
            default:
                return "wrong input!";
        }
    }
}

