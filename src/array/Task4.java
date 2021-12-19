package array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String str= "Sayora";

        int[] arr= {4,24,10,100,5,78,11,25,55, str.length()};
        //find the sum of the numbers from array and less than 10 fom the given
       int total=0;

        for( int num=0; num<arr.length; num++){

            if( arr[num]<10){
                total=total+arr[num];
            }
        }
        System.out.println(total);


    }
}
