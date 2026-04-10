class SumPositive {
     static void main() {
         System.out.println("Welcome to adding positive numbers");
         int[]arr = ArrayUtility.inputArray();

         int sum =0;
         for (int i : arr){
             if (i <0){
                 continue;
             }
             sum += i;
         }
         System.out.println("The sum of positive numbers is: "+ sum);
     }
}
