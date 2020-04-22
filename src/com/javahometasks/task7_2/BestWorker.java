package com.javahometasks.task7_2;

import java.util.List;

public class BestWorker {
    public static String getBestWorker(List<String> logs) throws InterruptedException {
        OperatorStatistics[] logThreads = new OperatorStatistics[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            logThreads[i] = new OperatorStatistics(logs.get(i));
            logThreads[i].start();
        }

        for (OperatorStatistics logThread: logThreads) logThread.join();

        return OperatorStatistics.getMaxOperatorLogin();
    }
}
