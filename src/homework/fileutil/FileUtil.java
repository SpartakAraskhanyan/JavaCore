package homework.fileutil;

import javax.management.StringValueExp;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("please input directory path!");
        String path = scanner.nextLine();
        System.out.println("please input file name!");
        String fileName = scanner.nextLine();
        File myDir = new File(path);
        String[] list = myDir.list();
        boolean a = true;
        for (String s : list) {
            if (s.equals(fileName)) {
                System.out.println(a);
            } else {
                System.out.println(!a);
            }
        }

    }


    static void contentSearch() throws IOException {
        System.out.println("please input dirPath!");
        String path = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        File myDir = new File(path);
        File[] list = myDir.listFiles();
        for (File file : list) {
            if (file.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file);
                        }
                    }
                }
            }
        }


    }

    static void findLines() throws IOException {
        System.out.println("please input dirPath!");
        String txtPath = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        File myDir = new File(txtPath);
        File[] list = myDir.listFiles();
        for (File file : list) {
            if (file.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(line);
                        }
                    }
                }
            }
        }

    }


    static void printSizeOfPackage() {
        System.out.println("please input path!");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            int a = 0;
            for (File file1 : files) {
                a += file1.length();
            }
            System.out.println(a / 2048);
        }
    }


    static void createFileWithContent() throws IOException {
        System.out.println("please input path !");
        String path = scanner.nextLine();
        System.out.println("please input file name !");
        String fileName = scanner.nextLine();
        System.out.println("please input content !");
        String content = scanner.nextLine();
        File file = new File(path, fileName);
        if (!file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(content);
            }
        }


    }

}
