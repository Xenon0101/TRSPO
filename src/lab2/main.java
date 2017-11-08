package lab2;

import java.util.Timer;

public class main {
    public static void main(String[] args) throws InterruptedException {
        (new Thread(new WriteRunnable())).start();
        (new Thread(new SumRunnable())).start();

    }
}
