package com.javahometasks.task7_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> logPaths = new ArrayList<>();

        for (int i = 1; i < 8; i++) logPaths.add(args[0] + "/" + i + ".txt");

        System.out.println(BestWorker.getBestWorker(logPaths));
    }
}
