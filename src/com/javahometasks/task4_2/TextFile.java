package com.javahometasks.task4_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFile {
    private String path;

    public TextFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void removeComments() throws IOException {
        String fileText = Files.readString(Paths.get(path));

        fileText = fileText.replaceAll("\\/\\*[\\S\\s]*?\\*\\/", "");
        fileText = fileText.replaceAll("\\/\\/.*", "");

        System.out.println(fileText);

        Files.writeString(Paths.get(new File("src/com/javahometasks/task4_2/out.txt").getPath()), fileText);
}
}

// FileUtils.writeStringToFile(new File("test.txt"), "Hello File");
// \/\*[\S\s]*?\*\/
// \/\/.*
