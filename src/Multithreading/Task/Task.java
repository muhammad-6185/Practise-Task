package Multithreading.Task;

public class Task extends Thread {
    @Override
    public void run() {
        System.out.printf(String.format(toString(), java.lang.Thread.currentThread().getId()));
        try {
            System.out.printf("Thread: %s - Sleeping for 5 Second\n", java.lang.Thread.currentThread().getId());
            java.lang.Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
