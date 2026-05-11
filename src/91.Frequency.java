import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
     static void main() {
         List<Integer> list = Arrays.asList(1,2,4,7,3,2,5,7,2,8,9);
         System.out.println(Collections.frequency(list,1));
         System.out.println(Collections.frequency(list,2));
         System.out.println(Collections.frequency(list,7));
     }
}
