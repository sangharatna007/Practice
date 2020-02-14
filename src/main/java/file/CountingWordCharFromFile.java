package file;

import java.io.*;

public class CountingWordCharFromFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            // create the bufferReader Object
            reader = new BufferedReader(new FileReader("C:\\Users\\sangharatna.davane\\Documents\\test.txt"));
            // read the first line into current line
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                // updating the line count
                lineCount++;
                // gettong number of current line
                String[] word = currentLine.split(" ");
                // update the word count
                wordCount = wordCount + word.length;
                // iterating the each word
                for(String chr : word)
                {
                    charCount = charCount+chr.length();
                }
                // read the next line into current line
                currentLine = reader.readLine();
            }
            System.out.println("Number of word in current file is :" + wordCount);
            System.out.println("Number of char in current file is :" + charCount);
            System.out.println("Number of line in current file is :" + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
