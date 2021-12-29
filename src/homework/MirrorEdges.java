package homework;

import java.util.Scanner;

public class MirrorEdges {
    public static void main(String[] args) {
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order (possibly overlapping).

For example,
the string "abXYZba" has the mirror end "ab". -> Because ab is in the begining also at the end.

Examples:

Input : abca
Output: a

Input : aba
Output: aba

Input : eerqwertyree
Output: eer
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string value");
        String str=input.nextLine().trim();
        int start =0;
        int end = str.length()-1;
        String mirror = "";
        for(int i=0; i<str.length();i++){

            if(str.charAt(start)==str.charAt(end)){

                start++;
                end--;
                mirror+=str.charAt(i);
            }
        }

        System.out.println(mirror);




    }
}
