package ru.geekbrains.core.lesson5.homework5;

import java.io.File;

public class Tree {
//    public static void main(String[] args) {
//        print(new File("."), "", true);
//    }

    static void print(File file, String indent, boolean isLast){
        System.out.print(indent);
        if (isLast){
            System.out.print("└─");
            indent += "  ";
        }
        else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                int subFileTotal = countFiles(files);
                int subFileCounter = 0;
                for (File subFile : files) {
                    print(subFile, indent, ++subFileCounter == subFileTotal);
                }
            }
        }
    }

    private static int countFiles(File[] files) {
        int count = 0;
        for (File file : files) {
            if (file.isFile() || (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0)) {
                count++;
            }
        }
        return count;
    }
}
