package lab2;

import java.util.Scanner;

public class SumRunnable implements Runnable{
    @Override
    public void run() {
        while (true) try {
            Scanner in = new Scanner(System.in);
            Thread.sleep(1000);
            System.out.println("Input int character: ");
            if (in.hasNextInt()){
                int i = in.nextInt();
                System.out.println(i*2);
            }
            else System.out.println("It's not an int!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
