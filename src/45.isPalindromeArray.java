class isPalindrome {
    static void main() {
        System.out.println("Welcome to the Array palindrome checker");
        int[] array = ArrayUtility.inputArray();
       boolean isplani= ispalindrom(array);
       if(isplani){
           System.out.println("Your array is palindrome");
       }
       else{
           System.out.println("Your number is not palindrome");
       }
    }

    public static boolean ispalindrom(int[] arr){
        int i = 0;
        while(i < arr.length/2) {
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}