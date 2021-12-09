package loops;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter an integer number ");
        int inputNum = input.nextInt();

        int divisor= 1;


        while (divisor<=inputNum){

            if(inputNum%divisor==0){
                System.out.println(divisor +   " is divisor of " + inputNum);

            }
            divisor++;

        }

    }
}
