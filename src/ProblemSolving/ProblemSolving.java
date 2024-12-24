package ProblemSolving;

import java.util.*;

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

    public ArrayList<Integer> subArraySum(int[] arr, int k) {
        int sum = 0;
        int pointer = 0;
        ArrayList<Integer> result = new ArrayList<>();

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
    public int findMissingNumber(int[] nums) {

        sortArray(nums);

        int num = 1;

        for (int i = 0; i < nums.length; i++) {
            if (num != nums[i]) {
                return num;
            }
            num+=1;
        }

        return num;
    }

    /**
     * Given an integer array arr[]. You need to find and return the maximum sum possible from all the subarrays.
     * Examples:
     * Input: arr[] = [1, 2, 3, -2, 5]
     * Output: 9
     * Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5).
     * Input: arr[] = [-1, -2, -3, -4]
     * Output: -1
     * Explanation: Max subarray sum is -1 of element (-1).
     * Input: arr[] = [5, 4, 7]
     * Output: 16
     * Explanation: Max subarray sum is 16 of elements (5, 4, 7)
     */
    public int maxSubarraySum(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0){
//                sum += arr[i];
//            }
//
//            if ((arr[i] < 0) && (sum != 0)) {
//                list.add(sum);
//                sum = 0;
//            }
//        }
//
//        if (list.isEmpty()) {
//            return -1;
//        }
//        list.sort(Collections.reverseOrder());
//
//        return list.get(0);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
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

    public void print(String val) {
        System.out.println(val);
    }

    public void printStudents(List<Student> students) {
        students.forEach(this::print);
    }

    private void print(Student student) {
        System.out.println(student);
    }
}
