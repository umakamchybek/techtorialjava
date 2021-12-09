package homework;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', print the
string without those 'x' chars, and otherwise print the string
unchanged.
Examples:

"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = input.next().toLowerCase();

        if(str.contains("x")){
            System.out.println();
        }

    }
}
