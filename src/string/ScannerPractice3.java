package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // use scanner to get
        // get name and DOB  year of user
        //calculate user's age
        //print "You are <age> years old"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = scanner.nextLine();

        System.out.println( "please enter your birth year ");
        int year = scanner.nextInt();
        int age = (2021 - year);

        System.out.println(name + " you are " + age +  "years old ");

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear+" year");
        int currentMinute = LocalDateTime.now().getMinute();
        System.out.println(currentMinute+" minutes");
    }
}
