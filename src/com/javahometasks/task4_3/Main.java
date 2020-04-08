package com.javahometasks.task4_3;

public class Main {
    public static void main(String[] args) {
        LogComparator a = new LogComparator();
        a.readLogsFile(args[0]);
        a.printLogs();
        System.out.println(a.peakConcurrentCalls());
    }
}
