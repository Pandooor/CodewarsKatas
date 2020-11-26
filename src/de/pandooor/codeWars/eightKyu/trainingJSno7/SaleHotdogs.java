package de.pandooor.codeWars.eightKyu.trainingJSno7;

public class SaleHotdogs {
    public static int saleHotdogs(final int n) {
//        Best Practice: 0-1ms
        return ( n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90 ) * n;
//        return firstSolution(n); //0-1ms
    }

    private static int firstSolution(int n) {
        int price = 0;
        if (n < 5) {
            price = 100;
        } else if (n < 10) {
            price = 95;
        } else {
            price = 90;
        }
        return n * price;
    }
}