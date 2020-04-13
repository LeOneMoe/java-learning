package com.javahometasks.task5_2;

public class Main {
    public static void main(String[] args) {
        OperatorStatistics a = new OperatorStatistics();
        a.readLogsFile(args[0]);
        a.printLogs();
        System.out.println(a.avgCallTime());
    }
}
