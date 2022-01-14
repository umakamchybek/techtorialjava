package homework;

import java.util.ArrayList;

public class Duplicates {
    /*
    Create a public method named duplicates that takes
     two int arrays as parameters and returns common elements of
      both arrays as an int array. IF there is no common element of
      arrays return null. NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
       For example: array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

return int array is [2,3,9] -> !!array is sorted

example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]

return int array is [1]
     */

    public static void main(String[] args) {
        int num1[]={1,6,7,2,3};
        int num2[]={2,3,9,};

        System.out.println(dublicates(num1,num2));
    }
    public static ArrayList dublicates(int[] num1, int[] num2){
        ArrayList dublicates=new ArrayList();
        boolean isdublicated=false;//flag means you will go with all the elements one by one and return only the ones that you want
        for(int i=0;i<num1.length;i++){
            isdublicated=false;
            for(int k=0;k<num2.length;k++){
                if(num1[i]==num2[k]){
                    dublicates.add(num1[i]);
                    isdublicated=true;
                }
            }
        }
        if(isdublicated){
            return dublicates;
        }else{
            return null;
        }

    }




}
