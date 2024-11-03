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

    public void sumOfNaturalNumbers(int sum, int pointer, int limit) {

        sum = sum + pointer;

        if (pointer == limit) {
            System.out.println(sum);
            return;
        }

        pointer++;
        sumOfNaturalNumbers(sum, pointer, limit);
    }

    public Integer calculateFactorial(int fact, int number) {

        if (fact == 0) {
            fact = number;
        }

        if (number == 1 || number == 0) {
            return fact;
        }

        fact = fact * (number - 1) ;
        return calculateFactorial(fact, number - 1);
    }

    public Integer calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int num1 = calculateFactorial(number - 1);
        return num1 * number;
    }
}
