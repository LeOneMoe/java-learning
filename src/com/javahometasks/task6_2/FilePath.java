package com.javahometasks.task6_2;

import java.util.Stack;

public class FilePath {
    Stack<String> path = new Stack<>();

    public FilePath(String path) {
        String[] pathToValid = path.split("/");

        for (String dir: pathToValid) {
            if (dir.equals("..")) {
                if (this.path.empty() || this.path.peek().equals("..")) this.path.push("..");
                else this.path.pop();
            }
            else if (dir.equals(".")) continue;
            else this.path.push(dir);
        }
    }

    @Override
    public String toString() {
        this.path.toArray(new String[0]);

        return String.join("/", path);
    }
}
