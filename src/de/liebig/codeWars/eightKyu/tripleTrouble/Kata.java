package de.liebig.codeWars.eightKyu.tripleTrouble;


public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
//        Already best practice: 0-1ms
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            answer.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return answer.toString();
//        return alternativeApproach(one, two, three); //22-25ms
    }

    public static String alternativeApproach(String one, String two, String three) {
        String s = "";
        for (int i = 0; i < one.length(); i++) {
            s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return s;
    }
}
