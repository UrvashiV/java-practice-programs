class SumAverage2DArray {
    static void main() {
        System.out.println(" Welcome to sum and Average of 2D Array");
        int [][] newArr = ArrayUtility.input2DArray();
        long sum = sum(newArr);
        double avg = Average(newArr);
        System.out.print("Your sum is: " +sum);
        System.out.print("\nYour Average is: "+avg);
    }
    public static long sum(int[][] numArr){
        int sum = 0;
        int i = 0;
        while( i <numArr.length){
            int j=0;
            while(j<numArr[i].length){
                sum +=numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double Average(int[][] numArr) {
        if(numArr.length ==0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows *cols;

        return sum(numArr) / size;
    }
}
