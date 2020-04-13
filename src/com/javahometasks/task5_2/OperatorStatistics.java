package com.javahometasks.task5_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OperatorStatistics {
    public List<CallLog> logs = new ArrayList<>();

    public OperatorStatistics() {
    }

    public OperatorStatistics(List<CallLog> logs) {
        this.logs = logs;
    }

    public void readLogsFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String[] log = scanner.nextLine().split(",");
                logs.add(new CallLog(log));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printLogs() {
        for (CallLog log : logs) {
            System.out.println(log.toString());
        }
    }

    public long avgCallTime() {
        float avg = 0;
        Set<String> operators = new HashSet();

        for (CallLog log : logs) {
                avg += log.getEnd() - log.getStart();
                operators.add(log.getName());
        }

        return (long) avg / operators.size();
    }
}