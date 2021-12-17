public class Arrays {

    public static void main(String[] args) {
        int number = 10; // books
        int [] numbers = new int[5];

        for (int i = 0;i < numbers.length;i++){
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

         int [] numbers2 = {1,2,3,4};
        for (int b = 0;b < numbers2.length;b++){
            System.out.println(numbers2[b]);
        }


    }
}
