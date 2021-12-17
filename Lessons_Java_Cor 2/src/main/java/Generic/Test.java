package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ///////////////   Java 5 Do ////////////////
        Animal0 animal0 = new Animal0();

        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(animal0);

        String animal =(String) animals.get(1);
        System.out.println(animal);

        ///////////////    Generic   ////////////
        List<String> animals2 = new ArrayList<>();
        animals2.add("Dog");
        animals2.add("Cat");
        animals2.add("Frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);


///////////////////   lessons 34\
        List<Animal> animalList = new ArrayList<>();

        List<Dog> dogList = new ArrayList<>();

        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        System.out.println();
        dogList.add(new Dog());
        dogList.add(new Dog());

        test(animalList);
        test(dogList);


    }
    private static void test(List<? extends Animal>  list){
        for (Animal animal  : list){
            animal.eat();
        }
    }

    static class Animal0 {

    }
}
