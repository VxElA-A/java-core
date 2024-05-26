package ru.geekbrains.core.lesson5.homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackUp {

    public static void backupFiles(String sourceDir, String backupDir) throws IOException {
        File sourceDirectory = new File(sourceDir);
        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                Path source = file.toPath();
                Path target = Paths.get(backupDir, file.getName());
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            }
        } else {
            throw new IOException("Файлы не найдены в директории" + sourceDir);
        }
    }
}