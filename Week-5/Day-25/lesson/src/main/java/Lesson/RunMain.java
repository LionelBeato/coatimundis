package Lesson;

public class RunMain {
    public static void main(String[] args) {

            // creating a new thread instance
//            Threads threads = new Threads();

            // main thread variable declared as read-only
            final Thread mainThread = Thread.currentThread();

            // runnables are nice because you can declare them using lambda expressions
            Runnable task = () -> {
                try {
                    // this interrupts the main thread and causes its try block to never resolve
                    mainThread.interrupt();
                    System.out.println("This thread is sleeping!");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

            new Thread(task).start();

        try {
            // this code will never be reached because the main thread was interrupted
            Thread.sleep(2000);
            System.out.println("Will this print?");
            System.out.println("This code will never print because the thread was interrupted.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        new Thread(threads).start();
            // this prints out before our thread above because we put that thread to sleep
            // remember that all operations in main belong to the main thread
            // the main thread can create new threads, however, as shown above
//            System.out.println("this also running");




    }
}
