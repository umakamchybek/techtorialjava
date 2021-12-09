package homework;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter grade letter and
         print the number value matcing with this grade.
          Example: Input : A Output: 4.0 Input:
          A- Output: 3.7 NOTE: The University uses a 4 point scale for grades;
          these “quality” grades are as follows 4.0 = A, 3.7 = A-, 3.3 = B+, 3.0 = B,
          2.7 = B-, 2.3 = C+, 2.0 = C, 1.7 = C-, 1.3 = D+, 1.0 = D, F = 0.0
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade in letter");
        String letter = input.next();
        if (letter.equals("A")) {
            System.out.println(4.0);
        } else if (letter.equals("A-")) {
            System.out.println(3.7);
        } else if (letter.equals("B+")) {
            System.out.println(3.3);
        }else if (letter.equals("B")) {
            System.out.println(3.0);
        }else if (letter.equals("B-")) {
            System.out.println(2.7);
        }else if (letter.equals("C+")) {
            System.out.println(2.3);
        }else if (letter.equals("C")) {
            System.out.println(2.0);
        }else if (letter.equals("C-")) {
            System.out.println(1.7);
        }else if (letter.equals("D+")) {
            System.out.println(1.3);
        }else if (letter.equals("D")) {
            System.out.println(1.0);
        }else if (letter.equals("F")) {
            System.out.println(0.0);
        }
    }
}