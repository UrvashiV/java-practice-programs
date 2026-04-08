import java.util.Scanner;

class DeleteFromArray {
    static void main(String[] args) {

        System.out.println("Welcome to the Array Deletion");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please enter the number you want to delete: ");
        int num = input.nextInt();
        int[] newArr = deleteNumber(numArray,num);
        System.out.println("Here is your new array after deletion: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[]numArray, int num){
        int occ= OccurrenceArray.noOfOccurrences(numArray, num);
        if(occ==0){
            return numArray;
        }
        int newSize= numArray.length - occ;
        int[] newArr = new int[newSize];

        int i =0, j=0;
        while (i < numArray.length){
            if(numArray[i] != num){
                newArr[j]= numArray[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

}