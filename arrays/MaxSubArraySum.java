package arrays;

import java.util.Arrays;

public class MaxSubArraySum {

    /*
     * Given an integer array nums, find the subarray with the largest sum, and
     * return its sum.
     * 
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * 
     * Step 1 : create a variable max Sum;
     * 
     * step 2 : Traverse array and find max sum and return
     * 
     * 
     */

    public static int maxSum(int[] nums) {
        // Time Complexity => O(n2) , Space Complexity = O(1);
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += nums[j];

                maxSum = Math.max(maxSum, sum);
            }

        }

        return maxSum;

    }

    /*
     * Kadane's algorithm -
     * 
     * Time Complexity ==> O(n)
     * 
     * int currentSum = 0;
     * int maxSum = first element;
     * update maxSum
     * 
     * if(currentSum<0){
     * currentSum = 0;
     * }
     */

    public static int maxSumKadane(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    /*
     * Print Subarray of max Sum
     * 
     * using Kadane's Algorithm
     * 
     * currentSum = 0;
     * maxSum= first element
     * start index =0;
     * end index = 0;
     * int tempStart = 0;
     * 
     * Add Current Element to CurrentSum
     * 
     * if(currentSum > maxSum){
     * 
     * maxSum = currentSum;
     * 
     * start = tempStart;
     * end current index;
     * }
     * 
     * if(currentSum<0){
     * currentSum =0 ;
     * 
     * trmpStart = i+1;
     * }
     * 
     * 
     * 
     */

    public static int[] maxSumSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = 0;
        int tempStart = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;

                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        int[] subArray = Arrays.copyOfRange(nums, start, end + 1);  // Copy of range excludes last index
        return subArray;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(Arrays.toString( maxSumSubArray(nums)));

    }

}