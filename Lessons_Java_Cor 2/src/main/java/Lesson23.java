import java.util.Locale;

public class Lesson23 {
    public static void main(String[] args) {
//        String x = "Hello";
//        x = x.toUpperCase();
//        System.out.println(x);

//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " Pavel";
//        String stringAll = string1 + string2 + string3;
//        System.out.println(stringAll);

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" my");
        sb.append(" Pavel").append(" )))");
        System.out.println(sb);

        System.out.printf("This is a String, %s \n", "NISE  ");


        System.out.printf("This is a String, %.1f \n",10.121212);
        System.out.printf("This is a String, %10d \n",10);
        System.out.printf("This is a String, %20d \n",10);
        System.out.printf("This is a String, %15d \n",10);



    }
}
