package ReadingFromFile;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {



        File file = new File("Test2");


        Scanner sc = new  Scanner(file);

        String line = sc.nextLine();

        String[] numbersString = line.split("0");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        sc.close();


    }
}
