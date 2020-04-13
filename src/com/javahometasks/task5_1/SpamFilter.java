package com.javahometasks.task5_1;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class SpamFilter implements BlackListFilter {
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        for (String word : blackList) comments.removeIf(n -> Pattern.compile("\\b" + word + "\\b", Pattern.MULTILINE).
                matcher(n.toLowerCase()).find());
    }
}
