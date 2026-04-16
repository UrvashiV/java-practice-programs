package in.kgcoding.challenge82;

public class ArrayOperations {

   private int[] numbers;

   public ArrayOperations(int[] numbers){
       this.numbers = numbers;
   }


   public class Statistics{
       double mean(){
           double sum = 0;
               for(int i : numbers){
               sum += i;
           }
               return sum/numbers.length;
       }
   }
}
