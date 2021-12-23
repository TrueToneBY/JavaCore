package Lessons44File;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Test2");
        PrintWriter printWriter = new PrintWriter(file);

       // System.out.println(System.in);
        printWriter.println("Test ro one");
        printWriter.println("Test ro duo");
        printWriter.println("Searilizacia(Zapis v object2)");
        printWriter.println("Privet Java Core" + " Hello)");

        printWriter.close();

        FileReader fileReader = new FileReader("Test2");
        int c;
        while ((c = fileReader.read())!=-1){
            System.out.print((char) c);
        }


    }
}
