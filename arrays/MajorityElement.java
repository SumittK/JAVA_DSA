package arrays;
import java.util.HashMap;
public class MajorityElement{
    /*
    Given an integer array num of  n size .

    Find out majority element.

    majorityElement = count of element is > n/2.

    Brute force check each and every occurence ,
    return element if it  counts >n/2

    Time Complexity==> O(n2);
    Space Complexity===> O(1);
    */


        public static int majorityElementBrute(int[] nums){

            int n = nums.length ;

            for(int i =0 ; i<n; i ++){
                int count = 0;

                for(int j =0 ; j<n ;j++){
                    if(nums[i] ==  nums[j]){
                        count++;
                    }

                    if(count> n/2){
                        return nums[j];
                    }
                }
            }
return -1;
        }


        /*
         Using HashMap Approach 
         Map Structure {
         Key ->  elemnt of array
         value -> frequency (no. of occurence);
         {}
         }
        */

        public static int majorityElementHashMap(int[]nums){

            HashMap<Integer , Integer> map  =  new HashMap<>();  ///  O(n) xtra space 
// Time complexity ===> O(n)
            for(int num: nums){
             if(map.containsKey(num)){
                map.put(num ,  map.get(num)+1);
             }else{
                map.put(num ,1);
             }
if(map.get(num) > nums.length/2){
    return num;
}
            }

return -1;
        }


    /*
    Boyr-Moore Voting Algo

    int count =0;
    int candidate = 0;

    array = [2,2,1,3,4,2,2]

 if count =0  candidate  = 2 (num)
 if(num ==  candidate)  = count++ 
 else count --

    
    */ 

 public static int majorityElementBoyr(int[]nums){
    int count = 0;
    int candidate = 0;

    for(int num : nums){
        if(count == 0){
            candidate = num;
        }

        if(num == candidate){
            count++;
        }else{
            count --;
        }
    }
    return candidate;
 }

        public static void main(String[]args){
            
            int [] nums = {2,2,3,1,1,1,1,1,1,1};
            System.out.println(majorityElementBoyr(nums));
        }
}