package Multithreading.ThreadClasss;

public class TaskThread extends Thread {

    @Override
    public void run() {
        System.out.printf(String.format(toString(), Thread.currentThread().getId()));
        try {
            System.out.printf("Thread: %s - Sleeping for 1 Second \n", Thread.currentThread().getId());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Thread Number: %s \n";
    }
}
