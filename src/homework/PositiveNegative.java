package homework;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        Write a Java program to get an integer number from
        the user and print whether it is positive or negative.
        Example Input number: 35 Output:
        positive Input number: -35 Output: negative
         */
        System.out.println("Please enter an integer number");
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();

        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }

    }
}
