package objects;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {

        MethodPractice object= new MethodPractice();


        object.ageCalculator(1992);


        MethodPractice object2=new MethodPractice();
        int[] nums={1,2,3,4,5,6,7,};
        double x= object2.sumOfArrayElements(nums);
        System.out.println(x);
        System.out.println(object2.sumOfArrayElements(nums));


        double v= object2.sumOfArrayElements(new int[]{1,2,3,4,5});//creating a new array
        System.out.println(v);







    }
}
