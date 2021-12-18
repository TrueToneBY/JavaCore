package Lessons45Serializator;

import java.io.*;

public class WritObject {
    public static void main(String[] args) {
        Person person1 = new Person(12,"Bob");
        Person person2 = new Person(30,"Max");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oOs = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
