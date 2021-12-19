package Lessons45Serializator;

import java.io.*;

public class WritObject {
    public static void main(String[] args) {
//        Person person1 = new Person(12,"Bob");
//        Person person2 = new Person(30,"Max");
        Person[] people = {new Person(1,"Bob"), new Person(2,"Saha"),new Person(3,"Max")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oOs = new ObjectOutputStream(fos);

//            oOs.writeObject(person1);
//            oOs.writeObject(person2);

            oOs.writeInt(people.length);
            for (Person person : people){
                oOs.writeObject(person);
            }

            //oOs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
