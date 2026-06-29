package arrays;

import java.util.HashMap;
public class LongestSubarray{
    /*
    Given a array og nums and a number K 
  Find longest substring that adds upto K

  If not present return 0;

  Exp :  int []arr = {10,5,2,7,1} ,  K=15

  O/p 4.


  ***For Variable Size Window ****
  int left =0
  int right =0

  if(condn is voilated){

  left++
  }

    */



  public static int longsetSubAr(int[]nums , int k){
// Only Works if all numbers are positive
    int n =  nums.length;
    int sum = 0;
    int count = 0;
    int left = 0;
    int maxLength=0;

    for(int right = 0 ; right< n ; right++){
        //Expand Window

        sum +=  nums[right];

        // shrink Window
        if(sum>k){
            sum -= nums[left];
            left++;
        }

        if(sum==k){
            maxLength =  Math.max(maxLength ,  right-left+1);
        }

      

  }
  return maxLength;
}



// using Hashing + prefix Sum

public static  int subArrLenHashPrefix(int[]nums ,int k ){

HashMap<Integer , Integer > map = new HashMap<>();
    int sum =0 ;
    int maxLength=0;
    for(int i=0 ;  i<nums.length ; i++){
        // Prefix sum Array
        sum += nums[i];

        // if sum==k

        if(sum==k){
     maxLength =  i+1; // i is starting from Zero
        }

     if(map.containsKey(sum-k)){

        int length = i -  map.get(sum-k);

        maxLength = Math.max(maxLength  ,  length);
     }

     if(!map.containsKey(sum)){
        map.put(sum , i);
     }



    }
return maxLength;
}


  public static void main(String[]args){
    
    int [] arr = {10,5,7,2,1};
    int k = 15;

    System.out.println(subArrLenHashPrefix(arr , k));
  }
}