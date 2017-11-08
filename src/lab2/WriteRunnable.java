package lab2;

public class WriteRunnable implements Runnable {
    @Override
    public void run() {
        while (true) try {
            System.out.println("\nI am working!");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
