package Flash;

import java.util.Scanner;

public class Project2Task4 {
    public static void main(String[] args) {
        /*
        Write a program that will accept only 6 digit
      numbers like 578432 and find multiplication
               (5*7*8*4*3*2) of all digits and sum
         (5+7+8+4+3+2)of all digits.
        Example 1:
     578432
           Multiplication of all digits is 6720
         The Sum of all digits is 29
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a six digit numbers");
        int num = input.nextInt();
        if(num>=100000&&num<999999) {

            int d1 = num % 10;
            System.out.println(d1);
            num = num / 10;
            int d2 = num % 10;
            System.out.println(d2);
            num = num / 10;
            int d3 = num % 10;
            System.out.println(d3);
            num = num / 10;
            int d4 = num % 10;
            System.out.println(d4);
            num = num / 10;
            int d5 = num % 10;
            System.out.println(d5);
            num = num / 10;
            int d6 = num % 10;
            System.out.println(d6);


            int total = d1 * d2 * d3 * d4 * d5 * d6;
            System.out.println("Multiplication of all digits are " + total);
            int sum = d1 + d2 + d3 + d4 + d5 + d6;
            System.out.println("The sum of all digits are " + sum);
        }else{
            System.out.println(" Your "+ num + "not acceptable");
        }





    }
}
