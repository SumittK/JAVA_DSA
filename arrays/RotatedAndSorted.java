package arrays;
import java.util.Arrays;

public class RotatedAndSorted{


    public static boolean check(int[]nums){
        boolean isRotatedAndSorted =  true;
        int n = nums.length;
        int[]ans  = new int[n];
        System.out.println(Arrays.toString(ans)  + " Intial array ans"); // [0,0,0,0,0]
        int d =0;    
        //check breakpont to get  "d"

        for(int i =0; i< n-1 ; i++){
            if(nums[i]> nums[i+1]){
               d = i;
            }
        }
    System.out.println("Positions "  +d);
   // create original array from shid n-d element to end and d elements at start
        for(int i = 0 ;  i <d ; i++){
           ans[i] = nums[(n-d)+i];

        }
    System.out.println(Arrays.toString(ans) + " first d element");
        for(int i= 0 ; i<n-d ;i++ ){
            ans[i+d] =  nums[i];
        }

        System.out.println(Arrays.toString(ans));
        // checking if sorted
        for(int j = 0 ; j< n-1 ; j++){
            if(ans[j]> ans[j+1]){
                isRotatedAndSorted = false;
            }

        }
return isRotatedAndSorted;
    }
/*
its time complexity = >  O(n-1 + d+n-d +n-1 ) ==> O(3n -2) ===> O(n)
its Space complexity ==-> O(n) ===> new array ans;

*/


/*
We need to solve it in O(n) time and O(1) space complexity;


exp >> guven array => {3,4,5,1,2}

condition for rotated and sorted 

Step 1 check breakpont 

if(a[i]> a[i+1]){
count++;
}

if(count >1)  return false 

as a sorted array will only break at one place 
** After rotation  a sorted array will be two sorted array after break point

3>4 ?
4>5 ? 
5>1 ? false count =1
1>2 ? 
2>3?  compare last element with first element as well

*/

public static boolean checkSorted(int []nums){
    int n = nums.length;
    int count = 0;

    for(int i=0 ;  i <n-1 ; i++){

        if(nums[i]>nums[i+1]){
            count++;
        }
    }

    if(nums[n-1]> nums[0]){
        count++;
    }
System.out.println("count :" + count);

    if (count>1)
        return false;
    else
        return true;

}


    public static void main(String[]args){
        
        int[]nums = {2,1,3,4};
        System.out.println(checkSorted(nums));

    }

}