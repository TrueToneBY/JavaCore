package Polimorfizm;

public class Dog extends Animal{

    @Override
    public void eat() {
       System.out.println("Eat Dog bark!!");
    }

    public void bark(){
        System.out.println("Dog im barkes !!!");
    }

}
