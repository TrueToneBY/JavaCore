public class Lesson19 {
    public static void main(String[] args) {
//        Human human1 = new Human();
        Human h1 = new Human("Bob",12);
        Human h2 = new Human("Max",45);
        Human h3 = new Human("Tom",43);
        h1.toString();
        System.out.println(h1);

//        h1.setName("Max");
//        Human.description = "Tom";
//        Human.getDescription();
//        h1.getAllFiels();
//        h2.getAllFieldouble d = 40;
//        System.out.println(Math.pow(2,4));
//        System.out.println( Math.PI);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();






        //human1.setAge(18);
        //human1.setName("Tom");
       // human1.getInfo();
    }
}

class Human{

    public String toString(){
        return name + " ," + age;
    }

    private String name;
    private int age;

    public static String description;
    private static int counPeople;

    public Human(){
        System.out.println("Hello one");
    }
    public Human(String name){
        System.out.println("Hello tho");
        this.name = name;
    }
    public Human(int age){
        System.out.println("Hello free");
        this.age = age;
    }
    public Human(String name,int age){
        System.out.println("Hell foo");
        this.name = name;
        this.age = age;
        counPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFiels(){
        System.out.println(name+ " ," + age+ " ," + description);
    }
    public void printNumberOfPeople(){
        System.out.println("Number of People = " + counPeople);
    }
}
