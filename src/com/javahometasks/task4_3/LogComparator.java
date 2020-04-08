package com.javahometasks.task4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogComparator {
    public List<CallLog> logs = new ArrayList<>();

    public LogComparator() {
    }

    public LogComparator(List<CallLog> logs) {
        this.logs = logs;
    }

    public void readLogsFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String[] log =  scanner.nextLine().split(",");
                logs.add(new CallLog(log));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printLogs() {
        for (CallLog log: logs) {
            System.out.println(log.toString());
        }
    }

    public int peakConcurrentCalls() {
        int max = 1;
        int startLog = 1;
        long currentEnd;

        for (int i = 0; i < logs.size(); i++) {
            while (startLog < logs.size() - 1) {
                int currentMax = 1;
                currentEnd = logs.get(i).end;

                for (int j = startLog; j < logs.size(); j++) {
                    if (currentEnd > logs.get(j).start) {
                        currentEnd = Math.min(logs.get(i).end, logs.get(j).end);
                        currentMax += 1;
                    }
                }

                if (currentMax > max) max = currentMax;
                startLog += 1;
            }
        }

        return max;
    }
}
