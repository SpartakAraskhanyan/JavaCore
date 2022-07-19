package chapters.chapter13.testFolder;

import java.io.File;
import java.io.IOException;

public class FileExample {
    static String filePath = "C:\\Users\\Sus\\IdeaProjects\\homeworks\\src\\chapters\\chapter13\\testFolder\\hello.txt";
static String newFilePath =  "C:\\Users\\Sus\\IdeaProjects\\homeworks\\src\\chapters\\chapter13\\testFolder\\hello3.txt";
    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);

       boolean b = myFile.renameTo(new File(newFilePath));
        System.out.println(b);
//        System.out.println(myFile.exists());
//        if (!myFile.exists()) {
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("isFile " + myFile.isFile());
//        System.out.println("isDirectory " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                if (myFile.isDirectory())
//                System.out.println(file.getName());
//            }
//
//        }
//        System.out.println(myFile.toURI());
//
    }
}
