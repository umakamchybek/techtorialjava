package Flash;

import java.util.Scanner;

public class Project2Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the quantity of quarters you have ");
        double quarters = input.nextDouble();
        System.out.println("Please enter the quantity of dimes you have ");
        double dimes = input.nextDouble();
        System.out.println("Please enter the quantity of nickels you have ");
        double nickels = input.nextDouble();
        System.out.println("Please enter the quantity of pennies you have ");
        double pennies = input.nextDouble();

        quarters=0.25*quarters;
        dimes=0.10*dimes;
        nickels=0.05*nickels;
        pennies=0.01*pennies;

        double total = quarters+dimes+nickels+pennies;
        System.out.println("You have total "+total + " dollars");

    }
}
