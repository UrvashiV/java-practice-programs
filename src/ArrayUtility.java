import java.util.Scanner;
public class ArrayUtility {
   public static  int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of the element: ");
        int size = input.nextInt();
        int[] num =new int[size];
        for (int i =0;i<size;i++){
            System.out.print("Please enter the element no " + (i+1) +": ");
            num[i]= input.nextInt();
        }
        return num;
    }

    public static void displayArray(int[] numArray){
       for(int i =0; i<numArray.length;i++){
           System.out.print(numArray[i]+ " ");
       }
        System.out.println();
    }

}
