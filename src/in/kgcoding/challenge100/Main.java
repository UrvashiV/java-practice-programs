package in.kgcoding.challenge100;

public class Main {
    static void main() throws InterruptedException {
        ThreadState t1  = new ThreadState();
        System.out.printf("\ncreated the thread %s",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s", t1.getState());
    }
}
