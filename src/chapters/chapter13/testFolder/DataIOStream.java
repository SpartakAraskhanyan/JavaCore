package chapters.chapter13.testFolder;


import java.io.*;

public class DataIOStream {
    private static final String FILE_PATH = "C:\\Users\\Sus\\IdeaProjects\\homeworks\\src\\chapters\\chapter13\\testFolder\\testFolder2\\textExample.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
//        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
//        out.writeInt(33);
//        out.writeBoolean(false);
//
//        out.close();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("h e l l o from java \r\n");
            bw.write("hello from java line 2!!!");
        }
    }

    public static void read() throws IOException {
//        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
//        System.out.println(inputStream.readInt());
//        System.out.println(inputStream.readBoolean());
//
//        inputStream.close();
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null){
//                System.out.println(line);
//            }
//
//        }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.println(a);
            }
            System.out.println("aCount = " + aCount);

        }
    }


}
