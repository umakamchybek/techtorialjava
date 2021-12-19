package array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] studenIds = new int[5];

       studenIds[0]=21;
       studenIds[1]=31;
       studenIds[2]=41;
      // studenIds[3]=51;
       //studenIds[4]=61;
        System.out.println(studenIds);
        System.out.println(studenIds[0]);
        System.out.println(studenIds[1]);
        System.out.println(studenIds[2]);
        System.out.println(studenIds[3]);
        System.out.println(studenIds[4]);

        System.out.println("====================");

        for( int i=0; i<studenIds.length; i++){

            System.out.println(studenIds[i]);
        }
        System.out.println("*****************");
        System.out.println(Arrays.toString(studenIds));//it will print out all elements
        System.out.println(studenIds);//hashcode


    }
}
