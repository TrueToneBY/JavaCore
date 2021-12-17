import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Input Goo");

        int age = sc.nextInt();

        switch (age){
            case 0 :
                System.out.println("Yuo new");
                break;
            case 7:
                System.out.println("Yuu scools go");
                break;
            case 18:
                System.out.println("Game over");
                break;
            default:
                System.out.println("viberi variant");
        }
    }
}
