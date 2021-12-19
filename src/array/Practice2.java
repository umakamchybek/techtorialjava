package array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {


        int[]numbers= {4,5,6,11,45,60};//you can't use if there is a scanner and u have to get the values from the user
        System.out.println(numbers[3]);//11

        //numbers[6]=66;  exception
        System.out.println(numbers[1]);
        numbers[1]=88;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));


        for(int m=0; m<numbers.length;m++)
            System.out.println(numbers[m]);

    }
}
