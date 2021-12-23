package Lessons49Recursia;

public class Test {
    public static void main(String[] args) {
        test(5);
//работа программы пока неиспользуется условия , без него будет бесконечность
    }
    private static void test(int n) {
        while (n == 0)
            return ;

        System.out.println(n);
            test(n - 1);
    }
}
