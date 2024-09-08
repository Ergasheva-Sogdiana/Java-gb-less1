package less1;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
//        writeFile("task3.txt", "Hello World!\nBack to USSR");
        readFile("task3.txt");
    }

    //    private static void writeFile(String path, String content) {
//
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(path);
//            fw.write(content);
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try{
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
    private static void writeFile(String path, String content) {
//        "C:\\Users\\Sogdiana\\IdeaProjects\\Seminar1JAVA"
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(content);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String readFile(String path) {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}
