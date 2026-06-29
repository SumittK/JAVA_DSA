package arrays;
import java.util.*;
public class TwoSum{

    /*
    Given an array of interger nums and a integer target , return indices which adds up to target

    Exp ==>  int [] int = {2,4,6,7};
    trget = 10

    O/p => [1,2]
    */

    public static int[] twoSumSolution(int[] nums ,  int target){
   
    HashMap<Integer ,  Integer> map = new HashMap<>();
    for(int i = 0 ; i<nums.length;i++){
        if(map.containsKey(target- nums[i])){
         return new int  []{i, map.get(target-nums[i])};
        }else{
            map.put(nums[i], i);
        }

    }
return new int[]{-1,-1};
    }


    public static void main(String[]args){
        int[] nums ={2,7,11,15};
      int   target =9;
        System.out.println(Arrays.toString(twoSumSolution(nums,target)));
    }

}