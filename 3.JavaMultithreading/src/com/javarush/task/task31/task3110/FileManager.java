package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path rootPath;

    private List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
            this.rootPath = rootPath;
            this.fileList = new ArrayList<>();
            collectFileList(rootPath);
    }

    public List<Path> getFileList() {
        return fileList;
    }

    private void collectFileList(Path path) throws IOException {
        if (Files.isRegularFile(path)) {
            Path relativePath = rootPath.relativize(path);
            fileList.add(relativePath);
        } else if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                for (Path pathDirectory : directoryStream) {
                    collectFileList(pathDirectory);
                }
            }
        }

    }

}
