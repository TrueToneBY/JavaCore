package Lessons35AnnonimClass;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        Animal animal1 = new Animal(){
          public void eat(){
              System.out.println("Realizator anonim Class Animal");
          }
        };
        animal1.eat();
    }
}
