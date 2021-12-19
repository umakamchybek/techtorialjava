package homework;

import java.util.Scanner;

public class FindingDad {
    public static void main(String[] args) {
        /*
        Using scanner ask user to provide the string value. Print "dad"
if the given string contains the "dad", but where the middle
 'a' char can be any char otherwise please do not print anything.
Please look carefully examples below.
Example:
Input the year: testdadtest
Output :dad
Input the year: testd7dtest
Output :dad
Input the year: testdodtest
Output :dad
Input the year: testDudtest
Output :dad
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str=input.nextLine();
        int index = 0;


        while (index<str.length()){
            if (str.charAt(index)=='d' && str.charAt(index+2)=='d'){
                System.out.println("dad");
            }
            index++;
        }

    }
}
