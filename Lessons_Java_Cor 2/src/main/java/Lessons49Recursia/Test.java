package Lessons49Recursia;

public class Test {
    public static void main(String[] args) {
        test(5);

    }
    private static void test(int n) {
        while (n == 0)
            return ;

        System.out.println(n);
            test(n - 1);
    }
}
