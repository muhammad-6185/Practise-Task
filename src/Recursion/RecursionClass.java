package Recursion;

public class RecursionClass {
    public void printValue(Long number) {

        if (number == 0) {
            return;
        }

        System.out.println("I am " + number +" number.");

        number--;
        printValue(number);
    }
}
