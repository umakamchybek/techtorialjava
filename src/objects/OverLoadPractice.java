package objects;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class OverLoadPractice {

    //find sum of two numbers
    public void sum(int num1, int num2){
        System.out.println("The sum is " + (num1+num2));
    }


    public void sum(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("Sum of array elements: " + sum);
    }

    public void sum(String something, int number1, int num2){
        System.out.println(something+(number1+num2));
    }


}
