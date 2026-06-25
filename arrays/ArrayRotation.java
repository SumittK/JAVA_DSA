package arrays;

import java.util.Arrays;
public class  ArrayRotation{

    /*
    Array Rotation ==>  LEFT ROTATION

        Left Or CounterClock Rotation  by k place 

        Store  array elemts till kth index 

        Shift all arrays to right

        put stored element at end 


    */

        // Naive approach Time Complexity ==> O(n*d);

 public static  int[] rotateArr(int[] nums ,  int d){
 int n = nums.length;
        
 for(int i=0 ;i <d ; i++){
     int first = nums[0];

     for(int j = 0 ; j< n-1 ; j++){
        nums[j]= nums[j+1]; 
    
     }
   nums[n-1] =first;
 }
 
return nums;
   }


   /*
   Better Approach   (LEFT)

   *** If we rotate  array  of  size n  by d  positon .

   Then last  (n-d) elements will be at front  and d elements will be at last.

   Step 1 => Take a array of size n which equals to size of original array.

   Step 2 => Copy (n-d) elements of  original array and paste it in front of new array.

   step 3 => Copy d elements from original and paste it at end of new array

   step4 =>  Copy all the elements of new array to original Array.
   
   */



   public static int[] rotateArrayBetter(int[] nums , int d){

    int n = nums.length;
    int[] temp =  new int[n];

    d %= n;


// Copying (n-d) elements at front
    for(int i =0 ;  i < n-d; i++){    
        temp[i] = nums[d+i];
    }
    //copying d elements at the back
     for(int i =  0 ; i< d ; i++){
        temp[n+i-d] = nums[i];
     }

  // copying all elemnts from temp ti nums

  for(int i = 0 ;  i <n ;i++){
    
    nums[i] = temp[i];
  }
return nums;
   }


   /*
   Optimal Approach (LEFT ROtation)
  Juggling Algorithm
   Approach ==> 


   
   */

public static void main(String[]args){
    int[] arr =  {11,12,13,14,15};

    System.out.println(Arrays.toString(rotateArrayBetter(arr, 2)));
}



}