package Lessons37;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException, ScanerException {

        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                throw new ScanerException("Hello )");
            }
        }


    }
}
