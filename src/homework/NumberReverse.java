package homework;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {

        /*
        Write a program in Java to display any number in reverse order. 
Please look examples below carefully.

Test Data :
Input : 12345 (it can be any number like 5 digits or 6 digits etc)
Expected Output : 54321

Input : 765432
Expected Output : 234567

Input : 23914
Expected Output : 41932
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int reversed=0;

        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
