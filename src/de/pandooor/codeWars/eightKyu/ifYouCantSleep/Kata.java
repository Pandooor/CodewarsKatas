package de.pandooor.codeWars.eightKyu.ifYouCantSleep;

class Kata {
    public static String countingSheep(int num) {
        StringBuilder awnser = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            awnser.append(i + " sheep...");
        }
        return awnser.toString(); //10-13ms
//        return alternativeSolution(num); //15-20ms
    }

    public static String alternativeSolution(int num) {
        String answer = "";
        for (int i = 1; i <= num; i++) {
            answer += (i + " sheep...");
        }
        return answer;
    }
}
