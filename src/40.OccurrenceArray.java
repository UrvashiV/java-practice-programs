import java.util.Scanner;
class OccurrenceArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Occurrences");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArray, num);
        System.out.println("Your element was found "+ occurrences + " times in array");

    }
     public static int noOfOccurrences(int[] numArr, int num){
        int occ =0;
        for (int i=0; i<numArr.length;i++){
            if(num == numArr[i]){
                occ++;
            }
            i++;
        }
        return occ;
     }
}
