package Multithreading.Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please provide String to e reversed:");
        String string = reader.readLine();

        ReverseStr reverseStr = new ReverseStr();

        /**
         * Reverse String
         */
        System.out.println(reverseStr.reverseStr(string, "", string.length() - 1));

        /**
         * Check Palindrome
         */
        System.out.printf("Is Palindrome: %s %n", reverseStr.validatePalindrome(string));
    }

}
