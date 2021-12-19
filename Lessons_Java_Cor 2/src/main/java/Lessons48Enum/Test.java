package Lessons48Enum;

public class Test {

    public static void main(String[] args) {

//        Animal animal = Animal.CAT;
//        switch (animal){
//            case CAT -> System.out.println("Its the Cat");
//            case DOG -> System.out.println("Its the Dog");
//            default -> System.out.println("No animal");
//        }

        Sesson sesson = Sesson.SUNBER;
        System.out.println(sesson.getTemperatyra());

        switch (sesson) {
            case SUNBER -> System.out.println("Its ware outWar");
            case AUTUMN -> System.out.println("Its out autuumn");

        }

        System.out.println(sesson instanceof Enum);

        Animal animal = Animal.CAT;
        System.out.println(animal);

        System.out.println(sesson.name());
        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());

        Sesson WINTER = Sesson.WINTER;
        System.out.println(WINTER.ordinal());

    }
    }
