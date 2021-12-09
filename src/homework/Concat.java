package homework;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        /*
  Using the scanner ask the user to enter a String value and if both string length
is same concatenatethem together then print the result. If both String
length is not same then omit last chars from the longer string so it is the same
length as the shorter string. After making both strings the same length then
concatenate them and print the result.
NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhon"
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string  1");
        String str=input.nextLine();
        System.out.println("Please enter a string  2");
        String str2=input.nextLine();

        if(str.length()==str2.length()){
            System.out.println(str.concat(str2));
        }else if(str.length()!=str2.length()){
            str.length();
            str2.length();
            System.out.println();
        }

    }
}
