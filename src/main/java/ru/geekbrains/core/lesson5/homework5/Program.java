package ru.geekbrains.core.lesson5.homework5;

import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        BackUp backUp = new BackUp();
        String sourceDir = "./source";  // директория, из которой нужно создать резервную копию
        String backupDir = "./backup";  // путь к директории, в которой будет создана резервная копия
        try {
            backUp.backupFiles(sourceDir, backupDir);
            System.out.println("Резервная копия успешно создана.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании резервной копии: " + e.getMessage());
        }

        Tree tree = new Tree();
        tree.print(new File("."), "", true);
    }
}
