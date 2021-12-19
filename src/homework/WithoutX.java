package homework;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', print the
string without those 'x' chars, and otherwise print the string
unchanged.
Examples:
texst
"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = input.next();

        String firstLetter = ""+str.charAt(0);
        String secondLetter =""+ str.charAt(1);


        if(firstLetter.equals("x")&&secondLetter.equals("x")){
            System.out.println(str.substring(2));
        }if (firstLetter.equals("x")){
            System.out.println(str.substring(1));

        }if(secondLetter.equals("x")){
            System.out.println(str.substring(0,1)+str.substring(2));
        }
        else{
            System.out.println(str);
        }

    }
}
