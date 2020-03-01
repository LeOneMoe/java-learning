package com.javahometasks.task4_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);

        Directory directory = new Directory(args[0]);

        System.out.println(directory.toString());

        System.out.println(TextFile.wordsFromFiles(directory.listOfTextFiles()));
    }
}
