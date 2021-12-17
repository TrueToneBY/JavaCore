public class Multidimension_arrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
      // System.out.println( numbers[1]);

       int [][] matrix = {{1,2,3,4,5},{6,7,8},{9,10}};

       System.out.println(matrix[2][0]);
       System.out.println(matrix[0][4]);

       String[][] s = new String[2][3];
       s[0][1]= "hollo";
       System.out.println(s[0][1]);

       for (int i = 0;i<matrix.length;i++){
           for (int j = 0;j < matrix[i].length;j++){
               System.out.print(matrix[i][j]+ "  ");
           }
           System.out.println();
       }
    }
}
