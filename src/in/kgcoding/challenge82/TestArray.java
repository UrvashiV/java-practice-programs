package in.kgcoding.challenge82;

public class TestArray {
    static void main() {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());

    }

}
