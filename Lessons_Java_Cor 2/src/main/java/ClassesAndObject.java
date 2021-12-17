public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 32;
        person1.name = "Pavel";

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 21;
        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);

        Person2 person21 = new Person2();
        person21.setName("");
        person21.setAge(-4);

        person21.setName("Poma");

        person21.Speek();
        String s1 = "Вова";
        person21.setName(s1);
        //person21.Speek();
        person21.sayHello();
        person21.calculateYearsToRetirement();
        int year1 = person21.calculateYearsToRetirement();
        int year2 = person21.calculateYearsToRetirement();
        System.out.println("Остаток до пенсии = " + year1);
        System.out.println("Остаток до пенсии = " + year2);
        person21.getName();
        person21.getAge();



    }
}
class Person {
    String name;
    int age;

}

class Person2 {
    private String name;

    private int age;

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("Некоректно Введите положительны возрост ");
        }else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = username;
        }
    }


    int calculateYearsToRetirement() {
        int pensia = 65;
        int yers =pensia - age ;
        return yers;
    }


    void Speek() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " " + age);
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

