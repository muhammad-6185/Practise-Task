package Multithreading.RunnableInterface;

public class Main {
    public static void main(String[] args) {
        int limit = 10;

        for (int i = 0; i <= limit ; i++) {
            Thread thread = new Thread(new Student());
            thread.start();
        }
    }
}
