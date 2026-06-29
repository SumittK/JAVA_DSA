package arrays;

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

  public static void main(String[]args){
    
    int [] arr = {10,-5,5};
    int k = 15;

    System.out.println(longsetSubAr(arr , k));
  }
}