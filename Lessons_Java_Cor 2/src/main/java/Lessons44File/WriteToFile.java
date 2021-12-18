package Lessons44File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        PrintWriter printWriter = new PrintWriter(file);

       // System.out.println(System.in);
        printWriter.println("Test ro one");
        printWriter.println("Test ro duo");
        printWriter.println("Searilizacia(Zapis v object2)");
        printWriter.println("Privet Java Core" + " Hello)");

        printWriter.close();

    }
}
