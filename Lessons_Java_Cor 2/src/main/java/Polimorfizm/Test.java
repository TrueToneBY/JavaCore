package Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();
        Animal animal1 = new Dog();
        dog.bark();
        Animal animal2 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        System.out.println();

        test(animal2);
        test(dog1);
        test(cat);


        Animal animal3 = new Dog();
        Dog dog2 = (Dog) animal3;
        dog2.eat();

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
