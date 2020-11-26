package de.pandooor.codeWars.eightKyu.abbreviateTwoWordName;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
//        Already Best Practice: 14-19ms
//        String[] names = name.split("\\s");
//        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();

//        Better looking and faster approach
        return alternativeOneLiner(name); //2-3ms
    }

    private static String alternativeOneLiner(String name) {
        return Arrays.stream(name.split(" "))
                .map(String::toUpperCase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining("."));
    }

}
