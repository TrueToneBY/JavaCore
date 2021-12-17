public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i == 15){
                break;
            }
            System.out.println(i);
            i++;

        }
        System.out.println("Game Over !)");

        for (int b = 0; b <= 15; b++){
            if (b %2==0){
                continue;
            }
            System.out.println(" namber b = " + b);
        }
    }
}
