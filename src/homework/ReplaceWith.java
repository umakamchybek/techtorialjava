package homework;

import java.util.Scanner;

public class ReplaceWith {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to provide String value.
Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
Look at example below carefully
						For example:
Input: Success
Output:
"auccess"
"aaccess"
“aaacess”
"aaaaess"
"aaaaass"
"aaaaaas"
"aaaaaaa"
“aaaaaaa”
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string value");
        String str=input.nextLine();
        int index = 1;
        String a = "a";
        while (index <= str.length()) {
            str = str.substring(index);
            str = a+str;
            index++;
            a +="a";
            System.out.println(str);
        }
    }
}
