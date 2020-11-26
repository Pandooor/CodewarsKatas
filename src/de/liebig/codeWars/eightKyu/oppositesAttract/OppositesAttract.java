package de.liebig.codeWars.eightKyu.oppositesAttract;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
//        Best Practice: 0-1ms
        return flower1 % 2 != flower2 % 2;
//        first Solution: 0-1ms
//        return ((flower1 + flower2) % 2) == 1;
    }

}