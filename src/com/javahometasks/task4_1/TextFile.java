package com.javahometasks.task4_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFile {

    final static String EXTENSION = "txt";

    public TextFile() {
    }

    public static int wordsFromFiles(List<File> textFiles) throws IOException {
        int totalWordCount = 0;

        for (File textFile: textFiles) {
            totalWordCount += wordCount(readTextFile(textFile));
        }

        return totalWordCount;
    }

    public static List<String> readTextFile(File textFile) throws IOException {
//        Map<Integer, String> textMap = new HashMap<>();
//        int i = 0;
//
//        try (Scanner myReader = new Scanner(textFile.getName())) {
//            while (myReader.hasNextLine())
//                textMap.put(i++, myReader.nextLine());
//        }
//
//        return textMap;
        List<String> lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            for(String line; (line = br.readLine()) != null; )
                lines.add(line);
        }

        return lines;
    }

    public static int wordCount(List<String> lines) {
        int wordCount = 0;

        for (String line : lines)
            wordCount += line.split("[\\s.,]+").length;

        return  wordCount;
    }
}
