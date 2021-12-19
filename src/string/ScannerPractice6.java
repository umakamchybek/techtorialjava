package string;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
        /*
        -deposit money for David

	David wants to deposit his paychecks into his account and already has $200
	He has 3 paychecks (610, 385, 975)
	he can only deposit one check at a time
	*Ask: "How much is Deposit amount?" every time he is making deposit
	after all of paychecks deposited in to account
	he bought a phone for $599 and headphone for $299
	*Ask: How much is phone?
	*Ask: How much is headPhone?
	Calculate his final money and print --> "Your final balance is <finalAmount>"
         */
        double balance = 200;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is deposit amount? ");
        double firstCheck = scanner.nextDouble();
        balance +=firstCheck;

        System.out.println("How much is deposit amount? ");
        double secondCheck = scanner.nextDouble();
        balance+=secondCheck;

        System.out.println("How much is deposit amount? ");
        double thirdCheck = scanner.nextDouble();
        balance+=thirdCheck;

        System.out.println("How much is phone? Please enter the amount");
        double phoneCost = scanner.nextDouble();
        balance -= phoneCost;

        System.out.println("How much is headphone? Please enter the amount");
        double headphoneCost = scanner.nextDouble();
        int balance1 =(int)(balance-headphoneCost);//i did casting

        System.out.println("Your final balance is " + balance1+"$");



    }
}
