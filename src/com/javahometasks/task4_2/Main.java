package com.javahometasks.task4_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        TextFile textFile = new TextFile(args[0]);

        try {
            textFile.removeComments();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
