import java.util.Optional;

public class Arrays_String {
    public static void main(String[] args) {
        int [] ints = new int[5];
        ints[0] = 10;
        System.out.println(ints[0]);
        System.out.println(ints[1]);

        String [] st = new String[5];
        st[0] = "Java";
        st[1] = "Hoolo ";
        st[2] = "Pavel";
        st[3] = "games";
        st[4] = "over";

        for (Object o : st){
            System.out.println(o);
        }
        int [] namber1 = {1,2,3,4};
        int sum = 0;
        for (int x : namber1){
            sum = sum + x;
            System.out.println(sum);
        }

        int value = 0;
        String s ;

    }
}
