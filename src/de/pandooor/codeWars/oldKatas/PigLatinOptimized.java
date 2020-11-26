package de.pandooor.codeWars.oldKatas;

public class PigLatinOptimized {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
