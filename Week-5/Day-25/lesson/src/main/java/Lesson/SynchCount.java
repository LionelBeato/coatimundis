package Lesson;

public class SynchCount {

    private int c = 0;

    public synchronized void increment(){
        c++;
    }

    public synchronized void decrement(){
        c--;
    }

    public synchronized int value(){
        return c;
    }

    public static void main(String[] args) {

        SynchCount newSync = new SynchCount();

        Runnable task1 = () -> {

            try {
                Thread.sleep(5000);
                System.out.println(newSync.value());
            } catch(Exception e){
                System.out.println(e);
            }
        };

        Runnable task2 = () -> {
            try {
                Thread.sleep(8000);
                newSync.increment();
                System.out.println(newSync.value());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
       new Thread(task1).start();
       new Thread(task2).start();
    }


}
