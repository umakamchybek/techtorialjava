package string;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {

        //when we use nextLine() we can enter multiple words
        // when use next it will not take more than one word

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(" This value of first string " + str);
        String str1 = scanner.next();

        System.out.println(" This value of string second " +str1);
    }
}
