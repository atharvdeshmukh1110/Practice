// Program to copy characters from one file to another using FileReader and FileWriter

import java.io.*;

class CopyCharacters
{
    public static void main(String args[]) {
        File infile = new File("DSoft1.txt");   // source file
        File outfile = new File("DSoft3.txt");  // destination file

        FileReader ins = null;
        FileWriter outs = null;
        int count = 0;

        try {
            ins = new FileReader(infile);   // open infile to read
            outs = new FileWriter(outfile); // open outfile to write

            int ch;
            while ((ch = ins.read()) != -1) {  // read till EOF (-1)
                outs.write(ch);                // write character to output
                count++;
            }

            System.out.println("File successfully copied.");
            System.out.println("Total characters copied: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } finally {
            try {
                if (ins != null) ins.close();
                if (outs != null) outs.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e);
            }
        }
    }
}
