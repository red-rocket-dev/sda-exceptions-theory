package pl.sda;

public class PrintingRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("hello world!");
        }
    }
}
