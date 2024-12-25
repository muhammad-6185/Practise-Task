package Multithreading.Task_2;

public class ProblemSolutions {

    public String reverseStr(String inputStr, String generatedStr, int pointer) {
        if (inputStr == null || inputStr.isEmpty()) {
            return inputStr;
        }

        if (pointer == 0) {
           return generatedStr + inputStr.charAt(pointer);
        }

        generatedStr = generatedStr + inputStr.charAt(pointer);

        pointer--;
        return reverseStr(inputStr, generatedStr, pointer);
    }

    public boolean validatePalindrome(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        value = value.toLowerCase();

        if (value.equals(reverseStr(value, "", value.length() - 1))) {
            return true;
        }

        return false;
    }

    /**
     * 1. Find the Factorial of a Number Using Recursion
     * Problem Statement:
     * Write a recursive function to calculate the factorial of a given number.
     *
     * Input: 5
     * Output: 120 (5! = 5 × 4 × 3 × 2 × 1)
     * Requirements:
     *
     * Use recursion to compute the factorial.
     * Ensure the function handles edge cases like 0! = 1.
     */
    public int findFactorial(int number) {
        return getFactorial(number, number);
    }

    private int getFactorial(int number, int product) {
        if (number < 1) {
            return 1;
        } else if (number == 1) {
            return product;
        }

        product = product * (number - 1);
        number-=1;
        return getFactorial(number, product);
    }

    /**
     * 3. Find the Missing Number in an Array
     * Problem Statement:
     * You are given an array of integers from 1 to n with one number missing. Write a Java program to find the missing number.
     *
     * Input: [1, 2, 4, 5]
     * Output: 3
     * Requirements:
     *
     * Use the formula for the sum of the first n natural numbers: n*(n+1)/2.
     * Ensure the solution works efficiently for large arrays.
     */

    public int getMissingNumber(int[] numbers) {
        numbers = sort(numbers);
        int n = numbers[numbers.length - 1];
        return (n * (n + 1)/2) - getSum(numbers);
    }

    private int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int pointer = i;
            while (pointer >= 0) {
                if (numbers[pointer] > numbers[pointer + 1]) {
                    int temp = numbers[pointer];
                    numbers[pointer] = numbers[pointer + 1];
                    numbers[pointer + 1] = temp;
                }
                pointer--;
            }
        }
        return numbers;
    }
}
