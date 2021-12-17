package Lessons37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        File file = new File("Test2");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Hello exseption");
        }
        System.out.println("Posle Exseption");
    }
}
