 class DiceRoll {

    public int roll(){
        double random = Math.random()* 6;
        return (int) Math.ceil(random);
    }

    static void main() {
        DiceRoll roll = new DiceRoll();
       for (int i = 0; i<10;i++) {
           System.out.println(roll.roll());
       }
     }
}
