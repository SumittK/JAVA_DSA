package arrays;

public class SecondLargestElement {

    /*

    Time Complexity O(2n)
    and Two Pass
    */

    public static  int  secondLargest(int[] nums) {

         int largest_num = nums[0];
         int second_num =  -1;
     // find largest element
        for (int num : nums) {

            if (num > largest_num) {
                largest_num = num;
            }
        }


        for(int i = 1 ; i <nums.length ; i++){
            
            if(nums[i] > second_num && nums[i] < largest_num){
                second_num = nums[i];
            }
        }
return  second_num;
    }


    /*
    One pass and  O(n)  >>> Only one loop

     initialize  largest and secondlargest with Integer.MIN_VALUE
     So that it will be less than all valid value in array
    */

public  static int onePassSecondLargest(int[]nums){

    int largest_num = Integer.MIN_VALUE;  //  -2147483648
    int second_largest = Integer.MIN_VALUE; // -2147483648


     for(int num : nums){

        if(num > largest_num){

            largest_num = num;
        }else if(num> second_largest  &&  num <largest_num){
            second_largest= num;
        }
     }

return second_largest;

}




    public static void main(String[]args){
        int [] numArray = {5,7,3,88,22,44,32, 76};
        System.out.println(onePassSecondLargest(numArray));
    }
// Time complexity O(n+n) = > O(2n) = > O(n)
}
