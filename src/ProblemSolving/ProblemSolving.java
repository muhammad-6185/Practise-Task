package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class ProblemSolving {

    /**
     * Given an unsorted array arr containing only non-negative integers,
     * your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target.
     * You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
     * Examples:
     * Input: arr[] = [1,2,3,7,5], target = 12
     * Output: [2, 4]
     * Explanation: The sum of elements from 2nd to 4th position is 12.
     */

    public List<Integer> subArraySum(int[] arr, int k) {
        int sum = 0;
        int pointer = 0;
        List<Integer> result = new ArrayList<>();

        getIndexes(arr, k, result, sum, pointer);

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    private void getIndexes(int[] arr, int k, List<Integer> result, int sum, int pointer) {
        for (int i = pointer; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > k) {
                pointer+= 1;
                sum = 0;
                getIndexes(arr, k, result, sum, pointer);
            }

            if (sum == k) {
                result.add(pointer + 1);
                result.add(i + 1);
                break;
            }

            if (!result.isEmpty()) {
                break;
            }
        }
    }

}
