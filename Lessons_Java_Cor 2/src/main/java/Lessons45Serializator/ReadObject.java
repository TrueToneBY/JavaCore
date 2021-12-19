package Lessons45Serializator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args)  {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 =(Person) oOs.readObject();
//            Person person2 =(Person) oOs.readObject();

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0;i < personCount;i++){
                people[i] =(Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);

           // ois.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
