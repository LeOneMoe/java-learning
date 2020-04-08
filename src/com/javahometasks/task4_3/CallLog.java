package com.javahometasks.task4_3;

public class CallLog {
    public long start;
    public long end;

    public CallLog(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public CallLog(String[] log) {
        this.start = Long.parseLong(log[0]);
        this.end = Long.parseLong(log[1]);
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

    @Override
    public String toString() {
        return start + "," + end;
    }
}
