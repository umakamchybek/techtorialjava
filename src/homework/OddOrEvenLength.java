package homework;

import java.util.Scanner;

public class OddOrEvenLength {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter one string value.
        If this string length is odd number print middle 3 string from given value.
         If the string length is even number print string without first letter.
         (You need to use if statement for this task)
         Example 1: Please enter the String value: test The output is: est
       Example 2: Please enter the String value: Chicago The output is: ica
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String str = input.nextLine();
        str= str.trim();
        int strLength = str.length();
        if (strLength%2==1){
            System.out.println(str.substring((strLength/2)-1, (strLength/2)+2));
        }
        else if (strLength%2==0){
            System.out.println(str.substring(1));
        }
    }
}
