package ProblemSolving;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int target = 15;

        ProblemSolving problemSolving = new ProblemSolving();
        System.out.println(problemSolving.subArraySum(arr, target));
    }
}
