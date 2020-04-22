package com.javahometasks.task7_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OperatorStatistics extends Thread{
    private static Map<String, Integer> operators = new HashMap<String, Integer>();
    private static final Object lock = new Object();
    private static int maxLogCount = 0;
    private static String maxOperatorLogin = null;
    public List<CallLog> logs = new ArrayList<>();

    public static String getMaxOperatorLogin() {
        return maxOperatorLogin;
    }

    public OperatorStatistics() {
    }

    public OperatorStatistics(List<CallLog> logs) {
        this.logs = logs;
    }

    public OperatorStatistics(String path) {
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

    @Override
    public void run() {
        for (CallLog log: logs) {
            synchronized (lock) {
                if (operators.containsKey(log.getName())) operators.put(log.getName(), operators.get(log.getName()) + 1);
                else operators.put(log.getName(), 1);

                if (operators.get(log.getName()) > maxLogCount) {
                    maxLogCount = operators.get(log.getName());
                    maxOperatorLogin = log.getName();
                }
            }
        }
    }
}