package Lessons42;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 == string2);


        System.out.println(x == y);

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
    }
}

class Animal{
    private int id ;

    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal Dount = (Animal ) obj;
        return this.id == ((Animal) obj).id;
    }
}