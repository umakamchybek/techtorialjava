package loops;

import java.util.Scanner;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show sum of the numbers btn/10-20
        int num = 10;
        int num2=20;
        int sum=0;
        do{
            sum+=num;

            num++;
        }while(num<=20);
        System.out.println("Sum is  "+sum);
        /*
        -Ask user to provide a number between 3 to 10
  - make a star tree for that many line
  (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****
         */

    }
}
