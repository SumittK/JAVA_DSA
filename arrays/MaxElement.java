package arrays;

public class MaxElement {

    /*
    Time Complexity O(n)
    */
    public static int largetstNumber(int[] nums) {
        int n = nums.length;
        int largest_Number = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (nums[i] > largest_Number) {
                largest_Number = nums[i];

            }
        }

        return largest_Number;
    }

    public static void main(String[] args) {
        int[] numsArray = { 4, 7, 8, 12, 8, 19 };
        System.out.println(largetstNumber(numsArray));
    }

}