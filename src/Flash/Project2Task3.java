package Flash;

import java.util.Scanner;

public class Project2Task3 {
    public static void main(String[] args) {
        /*
        I need to write a program that will take a given amount
of money and return the number of dollars in quarters,
dimes, nickels, and pennies that make up that given
amount
Example 1:
Please enter your balance:
2.36
$2.36 will make 9 quarters 1 dime 0 nickels and 1
pennies
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter total amount of money you have ");
        double total = input.nextDouble();
        int balance = (int)(total*100);
        //System.out.println(balance);

        int quarters= 25;
        int dimes=10;
        int nickles=5;
        int pennies=1;

       int quartersCount =balance/quarters;
        //System.out.println(quartersCount);
        int quarterRemainder = balance%quarters;
        //System.out.println(quarterRemainder);

        int dimeCount = quarterRemainder/dimes;
       // System.out.println(dimeCount);
        int dimeRemainder = quarterRemainder%dimes;
        //System.out.println(dimeRemainder);

        int nickelCount = dimeRemainder/nickles;
        //System.out.println(nickelCount);
        int nickelRemainder = dimeRemainder%nickles;
       // System.out.println(nickelRemainder);
        int pennyCount = nickelRemainder/pennies;
       // System.out.println(pennyCount);


        System.out.println("You have " + quartersCount+ " quarters " + dimeCount +
                " dimes " + nickelCount +" nickles "+ pennyCount+ " pennies");

    }
}
