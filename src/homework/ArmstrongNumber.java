package homework;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        Write a Java program to check whether a given number is an armstrong number or not. 
NOTE:
An Armstrong number, also known as narcissistic number, is a number that is
equal to the sum of the cubes of its own digits.
 For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
Look at example below carefully.

Test Data :
Input a number: 153
Expected Output :153 is an Armstrong number

Input a number: 230
Expected Output : 230 is not an Armstrong number
         */

        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int result=0, originalNumber,remainder=0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number){
            System.out.println(number + " is an Armstrong number.");
        }else{
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
