package string;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        // we will ask user to their first name
        // we will ask user to their last name
        // we will print firstName in lower case
        //last name in upper case.

        //.toLowerCase(); == makes all letters lower case
        //.toUpperCase();== makes all letter upper case
        String str  = "yusuf";
        str.toUpperCase();
        //if we don't reassign the string
        // it will not change its value

        System.out.println(str); // yusuf

        str = str.toUpperCase();

        System.out.println(str);


        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter your first name ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name ");
        String lastName = scanner.nextLine();

        System.out.println(firstName.toLowerCase() + " " +lastName.toUpperCase());

        System.out.println(firstName);
        //if i print like this i changed values or
        //non changed
        // if i apply method in print out paranthesis it will
        //print the values with method applied







    }
}
