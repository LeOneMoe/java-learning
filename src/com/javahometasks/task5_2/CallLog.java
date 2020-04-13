package com.javahometasks.task5_2;

public class CallLog {
    public long start;
    public long end;
    public String name;

    public CallLog(long start, long end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public CallLog(String[] log) {
        this.start = Long.parseLong(log[0]);
        this.end = Long.parseLong(log[1]);
        this.name = log[2];
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return start + "," + end + "," + name;
    }
}
