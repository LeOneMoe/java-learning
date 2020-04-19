package com.javahometasks.task1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String pattern = "[aeiou]";

        String word = "palindrome";
        System.out.println(word);

        char[] symbols = word.toCharArray();

        List<String> allMatches = new ArrayList<>();

        Matcher m = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(word);

        while (m.find()) {
            allMatches.add(m.group());
        }

        Collections.reverse(allMatches);

        int matchesIndex = 0;

        for (int i = 0; i < symbols.length; i++) {
            if (String.valueOf(symbols[i]).matches(pattern)) {
                symbols[i] = allMatches.get(matchesIndex).charAt(0);
                matchesIndex++;
            }
        }

        System.out.println(symbols);
    }
}
