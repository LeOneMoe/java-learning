package com.javahometasks.task6_1;

import java.util.Comparator;

public class CallLogLengthComparator implements Comparator<CallLog> {

    @Override
    public int compare(CallLog callLog1, CallLog callLog2) {
        return Long.compare(callLog1.getLength(), callLog2.getLength());
    }
}
