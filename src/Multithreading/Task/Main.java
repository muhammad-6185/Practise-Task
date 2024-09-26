package Multithreading.Task;

import Multithreading.ThreadClasss.TaskThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new TaskThread());
        Thread thread2 = new Thread(thread1);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Main thread Now completed...!");
    }
}
