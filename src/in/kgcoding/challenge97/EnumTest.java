package in.kgcoding.challenge97;

public class EnumTest {
    static void main() {
        System.out.println("Printing all the day of the week");
        for (Day day: Day.values()){
            System.out.printf("%s : %s\n", day,day.getType());

        }
    }


}
