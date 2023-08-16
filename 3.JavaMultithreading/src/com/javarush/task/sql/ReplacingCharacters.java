package com.javarush.task.sql;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReplacingCharacters {
    public static void main(String[] args) throws IOException {
        char aChar = 39;
        String newString = String.valueOf(aChar);
        int count = 0;
        String pathString = "D:\\IdeaProjects\\JavaRushTasks\\3.JavaMultithreading\\src\\com\\javarush\\task\\sql\\task05";

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Path.of(pathString))) {
            for (Path path : paths) {
                if (Files.isDirectory(path)) {
                    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                        for (Path newPath : directoryStream) {
                            if (Files.isRegularFile(newPath)) {
                                String string = Files.readString(newPath);

                                if (string.contains("&#39;")) {
                                    count++;
                                    String replaced = string.replaceAll("&#39;", newString);
                                    Files.writeString(newPath, replaced);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
