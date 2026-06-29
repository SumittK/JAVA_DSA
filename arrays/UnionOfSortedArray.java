package arrays;

import java.util.*;

public class UnionOfSortedArray {

    /*
     * 
     * Give Two Sorted Array of size m and n
     * 
     * Union of these array will have distinc value each present in both arrays
     * 
     * Exp:
     * 
     * arr1 = [1,2,3,4,,5] arr2 =[4,5,6,7]
     * 
     * arr1 U arr2 = [1,2,3,4,5,6,7] // it have all elemnts that are present in both
     * array but all distinct
     * 
     * Brute Force Approach=>
     * 
     * Merge Both Array
     * Sort the array
     * if( arr[i]==arr[i+1])
     * remove duplicate element
     * 
     * Step 1 => Create a list ArrayList of ynique numbers
     * 
     * Add num1 array in list then add elemnts of num2 if not in list
     * 
     * then sort it
     */

    public static List<Integer> unionArray(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(!list.contains(nums1[i])){
            list.add(nums1[i]);}
        }

     
        for (int j = 0; j < nums2.length; j++) {
            if (!list.contains(nums2[j])) {
                list.add(nums2[j]);
            }}
            // Sort the array using two pointer
    System.out.println(list + "  Merged Array");

            for (int i = 0; i < list.size()-1; i++) {
                for (int j = i+1; j < list.size(); j++) {

                    if (list.get(i) > list.get(j)) {
                        int temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
  //Time Complexity: O(n+m + n2)==> O(n2+n+m)
                }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2,3,4,5 };
        int[] nums2 = { 1,2,7 };

        System.out.println(unionArray(nums1, nums2));
    }

}