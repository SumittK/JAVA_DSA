package arrays;

import java.util.Arrays;

public class MoveZeros {

    /*
     * I/P array ===> [1,0,2,0,3];
     * 
     * O/P =====> [1,2,3,0,0];
     * 
     * Move all zeros to end and maintain relative position of non Zero element
     * 
     * Approach: (TWO POINTER) ==> Time Complexity O(n) Space Complexity ==>O(1);
     * Space C omplexity O(1) means no extra space Modification in same Array
     * 
     * int left = 0; // first occurence of non Zero;
     * 
     * int right=0 ==>Iteration through array
     * 
     * if non Zero element Find Swap elements
     * 
     * 
     * 
     * Brute Force :
     * 
     * Approach
     * 
     * create an carray of same size;
     * Insert all non-zero elments and fill rest index with Zeros
     * Copy all em]lements back to original array
     * 
     */

    public static int[] moveZeros(int[] nums) {
        // Brutte force
        // Time Complexity ==> O(n)
        // Space Complexity==> O(1)
        int n = nums.length;
        int[] ans = new int[n]; // extra space ===> Initial val [0,0,0,0,0]
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                ans[count] = nums[i];
                count++;
            }

        }

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
        return nums;

    }

    public static int[] moveZerosTwoPointer(int[] nums) {
        // Two Pointer Approach
        // Time Complexity ==> On Space => O(1)
        /*
         * L
         * 
         */
        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;

            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 4, 3, 0, 7 };

        System.out.println(Arrays.toString(moveZerosTwoPointer(nums)));
    }

}