package Multithreading.ThreadClasss;

public class Main {
    public static void main(String[] args) {

        int limit = 10;

        for (int i = 0; i <= limit ; i++) {
            Student student = new Student();
            student.start();
        }
    }
}