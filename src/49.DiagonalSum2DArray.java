 class DiagonalSum2DArray {
    static void main() {
        System.out.println("Welcome to Diagonal sum");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("Sum of Diagonals is : " + sum);

    }
    public static long sumOfDiagonal(int[][] numarr){
        long left = sumOfLeftDiagonal(numarr);
        long right = sumOfRightDiagonal(numarr);
        long sum = left + right;
        if(numarr.length % 2 !=0){
            int ind = numarr.length / 2;
            sum -= numarr[ind][ind];
        }
        return sum;
    }
     public static long sumOfLeftDiagonal(int[][] numarr){
        long sum =0;
        int i =0 ;
        while(i < numarr.length){
            sum += numarr[i][i];
            i++;
        }
         return sum;
     }
     public static long sumOfRightDiagonal(int[][] numarr){
         long sum =0;
         int i =0 ;
         while(i < numarr.length){
             int col = numarr.length-1- i;
             sum += numarr[i][col];
             i++;
         }
         return sum;
     }
}
