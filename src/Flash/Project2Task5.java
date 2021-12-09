package Flash;

import java.util.Scanner;

public class Project2Task5 {
    public static void main(String[] args) {
/*
Write a program that will accept 5 digit number and
will print reversed number at the end.
Example-1:
53876
The output is 67835
Example-2:
97352
The output is 2537
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter 5 digit numbers");
        int number = input.nextInt();
        int d1 =number % 10; // -->5
        number = number /10;         // -->1234
        int rev1 = d1 * 10;  // -->50

        int d2 =number % 10;// -->4
        number = number /10;        //  -->123
        int rev2 =rev1 + d2; //-->50 +4 =54

        int d3 =number % 10; // -->3
        number = number /10;         // -->12
        int rev3 = rev2 * 10 + d3;// -->54 * 10 =540  , 540 + 3 =543

        int d4 =number % 10;// -->2
        number = number /10;         // -->10
        int rev4 = rev3 * 10 + d4;// -->5432

        int d5 =number % 10; // -->`1
        number = number / 10;       // -->  1
        int rev5 = rev4 * 10 + d5;

        System.out.println(rev5);



    }
}
