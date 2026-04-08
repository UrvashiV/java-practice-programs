 class SortArray {

    static void main() {
        System.out.println("Welcome to Array Sorting Checkpost ");
        int[] numArray = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if( isInc || isDec){
            System.out.println("Your array is sorted");
        }
        else{
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] numArray){
        for(int i=0 ;i<numArray.length-1;i++){
            if(numArray[i] > numArray[i+1])
                return false;
        }
        return true;
    }

     public static boolean isDecreasing(int[] numArray){
         for(int i=0 ;i<numArray.length-1;i++){
             if(numArray[i] < numArray[i+1])
                 return false;
         }
         return true;
     }
}
