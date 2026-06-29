package arrays;

public class RightShift{

    /*
    To Shift a given array to right shift by "K" Shifts

    I/P => {1,2,3,4,5,6,7} , k=3
    
    k=1 => {7,1,2,3,4,5,6} 
    k=2 => {6,7,1,2,3,4,5}
    k=3 => {5,6,7,1,2,3,4} O/p

    1st Approach ==> Brute Force

    Approach

    1. Store last element  int last = nums[n-1];
    2. Shift all element 1 place right
    2. Insert at front nums[0] =  last;

    Time Complexity ==> O (n*K)==> O(n)
     if k > 50000  and n = 1000000  operation will be 5 billion it will exceed time
    Space Complexity ==> O(1)
    */


    public static int[] rightShift(int[]nums, int k){

        int n = nums.length;

        for(int i  = 0 ; i<k;i++){

            // store last element
            int last = nums[n-1];

            for(int j = n-1 ; j>0 ; j--){
                nums[j] =  nums[j-1]; // shifting one place to right
            }
      nums[0]  = last;  // adding last element  at right
        }
        
return nums;

    }


    /*
    Now Two pointer Approach
    Reversal Algorithm 

Step 1  => Reverse whole array
Step 2 => Reverse (0,k) element
Step 3 => Reverse (k, remaining element)

Time Complexity ==> O(n)

    */

public static int[] rightShiftTwoPointer(int[]nums , int k){
    int n = nums.length;
    
     k =  k%n;
     
     reverseArray(nums, 0 ,n-1);
     reverseArray(nums, 0 , k-1);
     reverseArray(nums, k , n-1);
return nums;

}

public static int[] reverseArray(int[]nums,int left,int right){

    while (left<right){
        int temp =   nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++;
        right--;
    }
return nums;
}


    public static void main(String[]args){
        
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] result = rightShiftTwoPointer(nums,k);
        for(int i = 0 ; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

}