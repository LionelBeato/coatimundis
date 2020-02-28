package Lesson;

public class Threads implements Runnable {

    // this comes from the functional interface called Runnable
    // this class implements the interface's run method
    @Override
    public void run() {

        try {
            // you can use .sleep() to pause a thread
            // this code steps through 1 thru 6 within 1 second intervals
            Thread.sleep(1000);
            System.out.println("1...");
            Thread.sleep(1000);
            System.out.println("2...");
            Thread.sleep(1000);
            System.out.println("3...");
            Thread.sleep(1000);
            System.out.println("4...");
            Thread.sleep(1000);
            System.out.println("5...");
            Thread.sleep(1000);
            System.out.println("6...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
