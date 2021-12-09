package loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /*
        ask user to provide a whole number
        create a multiplication from 1-10
         */
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a whole number ");
        int num = input.nextInt();

        int multiplier = 1;
        while (multiplier<=15){

            System.out.println(num +" * " +multiplier + " = " + (multiplier*num));
            multiplier++;

        }

    }
}
