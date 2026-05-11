import java.util.Arrays;
import java.util.List;

class ElementReverse {
     static void main() {
        List<Integer> list = Arrays.asList(1,3,5,7,9,12,56,78);
         System.out.println(list);
         reverse(list);
         System.out.println(list);
     }

     public static void reverse(List<Integer> list){
         //Collections.reverse(list);
         for (int i = 0; i < list.size()/2; i++) {
             ElementSwapping.swap(list,i,list.size()-1-i);

         }
     }
}
