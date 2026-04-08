import java.util.Scanner;
class ArraySumAverage {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array sum and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Your sum is: "+ sum);
        System.out.println("Your average is: "+ avg);
    }



    public static long sum(int[] numArray){
        long sum =0;
        for (int j : numArray) {
            sum += j;
        }
        return sum;
    }

    public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int)(sum/numArray.length);
    }

}
