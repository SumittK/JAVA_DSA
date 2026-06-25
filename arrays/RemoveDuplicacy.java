package arrays;

public class RemoveDuplicacy{

    /*
    Given array is Sorted . K is number of unique elements in array

    Remove duplicacy and return unique number of elemnets.

    */


    /*
    1st Approch  

    1. find duplicate
    2. shift array one position left
    3.Reduce effective size of array
    4. Check if same iindex is having in dupe



    Time Complexity O(n2).
    Space Complexity O(1).
    */


    public static int removeDuplicate(int [] nums){
       
        int n = nums.length;
     // {1,1,2,3,3} => {1,2,3,3}==>
        //check if dupe
        for(int i = 0 ; i<n-1; i++){
            if(nums[i] == nums[i+1]){
               
           for(int j = i+1 ; j<n-1;j++){
                    nums[j] = nums[j+1];
                 }
              n--; //  index removing
              i--; // recheck elements

                // shift all elements of array one place left


            }
        }
return n;

    }


/*
Two Pointer Approach 


****TWO Pointer Approach****

Two pointer approach  is one of the most important DSA Technique.
Instead of nested loop, we use two indices(pointers) to traverse the data efficiently.

What is Pointer?
Pointer is simply an index variable;

int left = 0 ; ==> points to first elemnt 
int right =  length-1; ==> points to last elemnt


Approach of Remove duplicacy using two pointers:->

** Same directional Two Pointer
Step1 => if  numArray is empty return 0;
Step2 => Initialize  two pointer left =0 and right =1;
Step3 => Right Pointer will traverse  through Array & left will be compared with right one,

left =0 ==> points to last unique element.

right =1 ==> Iterate through  Array

if(arr[right] != arr[left])
left++;  // icrease left by 1

copy elemnt at  right  to index of left






*/


public static  int removeDupe(int[]nums){

    if(nums.length == 0){
        return 0;
    }

    int left = 0;  // last pace of unique elment


    for(int right =1 ;  right<nums.length ; right ++){

        // check if elemment is unique
        if(nums[right] !=  nums[left] ){
            left++;
            nums[left] = nums[right];
        }
    }
return left+1;
}




public static void main(String[]args){      
        int[] nums = {1,1,2};
        System.out.println(removeDuplicate(nums));
    }


}