package Multithreading.RunnableInterface;

public class TaskThread implements Runnable {

    @Override
    public String toString() {
        return "Thread Number: %s \n";
    }

    @Override
    public void run() {
        System.out.printf(String.format(toString(), java.lang.Thread.currentThread().getId()));
        try {
            System.out.printf("Thread: %s - Sleeping for 1 Second\n", java.lang.Thread.currentThread().getId());
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
