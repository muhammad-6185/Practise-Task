package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
}
