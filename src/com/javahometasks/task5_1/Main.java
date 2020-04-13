package com.javahometasks.task5_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> comments = new ArrayList<>();
        Set<String> blackList = new HashSet<>();

        comments.add("some comment");
        comments.add("comment with spam");
        comments.add("another normal comment");
        comments.add("another comment with ad");

        blackList.add("spam");
        blackList.add("ad");

        SpamFilter spamFilter = new SpamFilter();
        spamFilter.filterComments(comments, blackList);

        for (String comment: comments) {
            System.out.println(comment);
        }
    }
}
