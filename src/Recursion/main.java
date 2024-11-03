package Recursion;

public class main {
    public static void main(String[] args) {

        RecursionClass job = new RecursionClass();
        job.printValue(1L, 10L);
        job.sumOfNaturalNumbers(0, 0, 10);
        System.out.println("Factorial 1: " + job.calculateFactorial(0, 3));
        System.out.println("Factorial 2: " + job.calculateFactorial(3));
    }

}
