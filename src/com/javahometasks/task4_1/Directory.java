package com.javahometasks.task4_1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private String path;
    List<File> listOfFiles = new ArrayList<>();

    final static String EXTENSION = "txt";

    public Directory(String path) {
        this.path = path;
    }

    public List<File> listOfFiles() {
        File directory = new File(path);

        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile())
                listOfFiles.add(file);
        }

        return listOfFiles;
    }

    public List<File> listOfTextFiles() {
        List<File> textFiles = new ArrayList<>();

        for (File file: new Directory(path).listOfFiles()) {
            if (file.getName().split("[.]")[file.getName().split("[.]").length - 1].equals(EXTENSION))
                textFiles.add(file);
        }

        return textFiles;
    }

    @Override
    public String toString() {
        String stringOfFiles = "";

        for (File file: this.listOfFiles()) {
            stringOfFiles += file.getName() + " ";
        }

        return stringOfFiles;
    }


}
