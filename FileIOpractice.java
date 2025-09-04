
//FileIOpractice.java
// dH 9/4/25

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOpractice {
    public static void main(String[] args) {

        System.out.println("Hi Today we worked on FileIO");

        // Create a Bufferedwriter object and use it

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter( "myoutputFile.txt"));
            bufferedWriter.write("\n line one");
            bufferedWriter.write("\n line two");
            bufferedWriter.write("\n line three");
            bufferedWriter.close();
            System.out.println("\n File name myOutputFile.txt successfully written\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}