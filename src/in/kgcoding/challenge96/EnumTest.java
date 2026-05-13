package in.kgcoding.challenge96;

public class EnumTest {
    static void main() {
        System.out.println("Printing all the days of the week");
        //first method

        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);

        //second method
        for(Day day: Day.values()){
            System.out.println(day);

        }
    }


}
