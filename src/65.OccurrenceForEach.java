import java.util.Scanner;

class OccurrenceForEach {
     static void main() {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to finding the occurrences");
         int[] arr = ArrayUtility.inputArray();
         System.out.print("Please enter your number, you want to search: ");
         int element = input.nextInt();
         int occ= occurrences(arr,element);
         System.out.println("Your element was found "+ occ + " times in the array");

     }
     public static int occurrences(int[] nums, int num){
         int occ =0;
         for (int i : nums){
             if(num == i){
                 occ ++;
             }
         }

         return occ;
     }
}
