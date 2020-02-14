package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            // opening file in apppend mode
            writer = new FileWriter("C:\\Users\\sangharatna.davane\\Documents\\test.txt");
            // wrapping writer object with bufferedWriter
            bufferedWriter = new BufferedWriter(writer);
            // wrapping bufferedwriter object with printWriter
            printWriter = new PrintWriter(bufferedWriter);

            printWriter.println();
            printWriter.println("Santosh : 2010");
            printWriter.println("Sandeep : 2020");
            printWriter.println("Test : 1569");
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                printWriter.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
