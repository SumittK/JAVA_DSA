package arrays;

public class SortColor{
    
    /*
    Given an array of 0,1,2 sort the array in place

    Exp : int [] arr = {0,1,2,0,1,2};
    O/p => {0,0,1,1,2,2}

    Approach 1 ==> Brute Force
    1. Count number of 0's , 1's and 2's
    2. Fill the array with count of 0's , 1's and 2's

    Time Complexity ==> O(n)
    Space Complexity ==> O(1)

    Approach 2 ==> Two Pointer Approach
    Dutch National Flag Algorithm

    */

    public static int[] sortColorBrute(int []array){
        int [] solarray =  new int [ array.length];
        int count0 = 0;
        int count1= 0;
        int count2 = 0;


        for(int i = 0 ;i<array.length ; i++){
            if(array[i] ==0){
                count0++ ;
            }else if(array[i]==1){
                count1++ ;
            }else if(array[i]==2){
                count2++;
            }
        }

    for(int i= 0 ; i< count0 ; i++){

        solarray[i] = 0;
    }


    for(int i = count0; i< count0+count1 ; i++ ){
        solarray[i] =  1;
    }


    for(int i = count0+count1 ;  i< array.length ; i++){
        solarray[i] =2;
    }
    return solarray;
    }

/*

Dutch national Flag Algo

Kepp 3 ponters 

low  = 0 
mid  = 0 
high = n-1

arr =  0,1,2,0,1,2

       l m       high

       if arr[m] ==0;

       swap with arr[low] = arr[mid]

       low++

       mid ++

  if arr[]     

*/


public static int[] sort012(int [] nums){

    //Duthch Flag Algorithm

    //Step 1 ==> keep three pointers low =0 , mid=0 , high = n-1;
    int n = nums.length-1;
    int low=0;
    int mid =0;
    int high = n;

     while(mid<= high){

        if(nums[mid]== 2){
           int temp = nums[high];
           nums[high]= nums[mid];
           nums[mid] = temp;

            high--;
        }

        if(nums[mid]==0){
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;

            low ++;
            mid++;
        }


        if(nums[mid]==1){
            mid++;

        }
     }
return nums;
}



    public static void main(String [] args){
        
        int [] arr = {0,1,2,0,1,2};
        int [] solarray = sort012(arr);
        for(int i = 0 ; i< solarray.length ; i++){
            System.out.print(solarray[i]+" ");
        }
    }
}