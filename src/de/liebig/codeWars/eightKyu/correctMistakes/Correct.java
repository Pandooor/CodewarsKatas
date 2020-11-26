package de.liebig.codeWars.eightKyu.correctMistakes;

public class Correct {

    public static String correct(String string) {

//        Best Practice: 1-2ms
        return string.replace("5","S").replace("0", "O").replace("1","I");
//        return firstSolution(string);//    15-19ms
    }

    private static String firstSolution(String string) {
        for (int i = 0; i < 10; i++) {
            char replaceWith;
            switch (i) {
                case 0:
                    replaceWith = 'O';
                    break;
                case 1:
                    replaceWith = 'I';
                    break;
                case 5:
                    replaceWith = 'S';
                    break;
                default:
                    continue;
            }
            string = string.replaceAll("" + i, replaceWith + "");
            //both replace and replaceAll replace all occurring matches
            //replaceAll can use a regular expression pattern (regex) like "\\d" and should only be used for this
        }
        return string;
    }
}
