package Multithreading.Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please provide String to e reversed:");
        String string = reader.readLine();

        ProblemSolutions problemSolutions = new ProblemSolutions();

        /**
         * Reverse String
         */
        System.out.println(problemSolutions.reverseStr(string, "", string.length() - 1));

        /**
         * Check Palindrome
         */
        System.out.printf("Is Palindrome: %s %n", problemSolutions.validatePalindrome(string));

        System.out.println("Factorial of 5 is: ");
        System.out.println(problemSolutions.findFactorial(5));


        int[] array = {1,8,9,10,12,20,13,14,15,22,2,3,4,11,5,6,7,16,17,18,19};
        System.out.print("Missing Number: ");
        System.out.println(problemSolutions.getMissingNumber(array));
    }

}
