package array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

      int[] arr= {4,24,10,100,5,78,11,25,55};
      //print out numbers that are greater than 10
        int[]largeNumbers=new int[arr.length];

      for( int num =0; num<arr.length; num++){
          if(arr[num]>10) {
              largeNumbers[num]=arr[num];

              //System.out.println(arr[num]);
          }
      }
        System.out.println(Arrays.toString(largeNumbers));
      Arrays.sort(largeNumbers);
        System.out.println(Arrays.toString(largeNumbers));

    }
}
