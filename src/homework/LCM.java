package homework;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
/*
Please find the LCM(least common multiple) of two given integers.

NOTE:  The LCM of two integers is the smallest positive integer
that is perfectly divisible by both the numbers (without a remainder).
Please look at example carefully.
EXAMPLES:
Input 1: 72
Input 2: 120
Output : 360

Input 1: 24
Input 2: 60
Output : 120
 */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=input.nextInt();

        System.out.println("Enter the number 2");
        int num2= input.nextInt();
        int lcm=1;

        lcm = (num1 > num2) ? num1 : num2;

        // Always true
        while(true) {
            if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
    }
}
