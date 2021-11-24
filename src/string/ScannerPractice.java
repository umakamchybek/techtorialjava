package string;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        String name = "David";
        System.out.println("My name is " + name);

        // creating a Scanner object

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        System.out.println(lastName);
        System.out.println(lastName);

        // Task:  Ask user to enter his/her city name and print as :
        // "<name> <Last name> you are living in <city>" and <age>
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please enter your city name");
        String cityName = input.nextLine();
        System.out.println( name + " " + lastName + " you are living in " + cityName);

        Scanner input3 = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println( name + " " + lastName + " you are living in " + cityName + " and your age is " + age);

        System.out.println("Please enter your height in feet and inches (i.e: 5.8)");
        double height = input.nextDouble();
        System.out.println("Your height is " + height);

        System.out.println("Please enter your address");
        //input = new Scanner(System.in);
        input.nextLine();


        String address = input.nextLine();
        System.out.println("Is this correct address you provided? " + address);

    }

}
