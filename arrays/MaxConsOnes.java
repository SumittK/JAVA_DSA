package arrays;

public class MaxConsOnes{

    /*

In given binary array find maxlength of consecutive 1s";

Approach ==>

    left =0;
    right 1;

for(int right = 1 ;  right< n ; right++){
    


}
    
    */


public static int maxConsOnes(int[]nums){

    int count = 0 ;
    int maxCount = 0 ; 

    for(int i= 0 ; i< nums.length ; i++){

        if(nums[i]==1){
            
            if(maxCount<count){
                maxCount= count;
            }
           count++;

        }else{
        
            count = 0;
        }

    }
    return count;

}

public static void main(String[]args){
    int [] nums = {1,1,0,1,1,1, 0,1,1,1,1,1};

    System.out.println(maxConsOnes(nums));
}
}