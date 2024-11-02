package Recursion;

public class RecursionClass {
    public void printValue(Long number, Long limit) {

        if (number > limit) {
            return;
        }

        System.out.println("I am " + number +" number.");

        number++;
        printValue(number, limit);
    }
}
