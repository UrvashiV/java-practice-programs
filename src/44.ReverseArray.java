 class ReverseArray {
     static void main() {
         System.out.println("Welcome to the Array Reversal");
         int[] array = ArrayUtility.inputArray();
         reverse(array);
         System.out.println("Yur reversed array is: ");
         ArrayUtility.displayArray(array);
     }

        public static void reverse(int[] arr){
            int i = 0;
            while(i < arr.length/2){
                int swap = arr[i];
                arr[i] = arr[(arr.length- 1) - i];
                arr[(arr.length-1)-i] = swap;
                i++;
            }
        }
}
