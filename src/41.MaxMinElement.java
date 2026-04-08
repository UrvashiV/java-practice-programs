class MaxMinElement {
    static void main() {
        System.out.println("Welcome to the max and min");
        int[] numArray = ArrayUtility.inputArray();
        int max = max(numArray);
        int min = min(numArray);
        System.out.println("Minimum element is: "+min);
        System.out.println("Maximum element is: "+max);
    }
    public static int min(int[] numArray){
        if(numArray.length==0){
            return Integer.MAX_VALUE;
        }
        int min= numArray[0];
        for(int i =0; i<numArray.length;i++){
            if(min > numArray[i]){
                min = numArray[i];
            }
        }
        return min;
    }
    public static int max(int[] numArray){
        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max= numArray[0];
        for(int i = 1; i<numArray.length;i++){
            if(max < numArray[i]){
                max= numArray[i];
            }
        }
        return max;
    }
}
