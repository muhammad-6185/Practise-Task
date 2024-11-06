package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
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

    /**
     * You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
     * This array represents a permutation of the integers from 1 to n with one element missing.
     * Your task is to identify and return the missing element.
     * Examples:
     * Input: arr[] = [1, 2, 3, 5]
     * Output: 4
     * Explanation: All the numbers from 1 to 5 are present except 4.
     */
    public List<Integer> findMissingNumber(int[] nums) {
        sortArray(nums);

        List<Integer> result = new ArrayList<>();

        int num = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (num != nums[i]) {
                result.add(num);
                i-=1;
            }
            num+=1;
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    private void sortArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
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
