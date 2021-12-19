package array;

import java.util.Arrays;

public class CombinigArrays {
    public static void main(String[] args) {

        int[] nums1={3,4,5};
        int[] nums2={6,7,8,9};
        //combine these two arrays
        int[] result = new int[nums1.length+nums2.length];

         for( int i=0; i<nums1.length; i++){
             result[i]=nums1[i];

         }
        System.out.println(Arrays.toString(result));

         for(int b=nums1.length,c=0; b<result.length; b++,c++){

             result[b]=nums2[c];
         }
        System.out.println(Arrays.toString(result));



    }
}
