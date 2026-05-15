package in.kgcoding.challenge99;

public class HelloThread extends Thread{
    private final int threadNUmber;


    public HelloThread(int threadNUmber) {
        this.threadNUmber = threadNUmber;
    }

    @Override
    public void run() {
        for(int i =0; i<10; i++){
            System.out.printf("(%d) Hello from thread - %d\n",i+1,threadNUmber );
        }
    }
}
