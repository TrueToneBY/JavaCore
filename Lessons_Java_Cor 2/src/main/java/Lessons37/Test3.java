package Lessons37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("Test2");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Helo exception");
        }

        try {
        int x = 1 / 0 ;
        }catch (RuntimeException exception){
            System.out.println("Hello 000");
        }
    }
}
