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

    public static int[][] input2DArray(){
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int col = input.nextInt();
        int [][] numArray = new int[rows][col];
        int i =0;
        while(i< rows){
            int j=0;
            while(j<col){
                System.out.print("Please enter the element row:" + (i+1)+
                        ", column: "+ (j+1)+" :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray){
       for(int i =0; i<numArray.length;i++){
           System.out.print(numArray[i]+ " ");
       }
        System.out.println();
    }

}
