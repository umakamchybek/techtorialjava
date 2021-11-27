package string;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        //Task: get string from user
        //	print first, last, middle, second matching 'c', lengh, index of x

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the string name ");
        String word = scanner.nextLine();


        System.out.println("First " + word.charAt(0));
        System.out.println("Last " + word.charAt(word.length()-1));
        System.out.println("Middle " + (word.charAt(word.length()/2)));
        System.out.println("Second matching  " + word.indexOf('c',word.indexOf('c')+1));
        System.out.println("The length of the string is " + word.length());
        System.out.println(" the index of 'x is " + word.indexOf('x'));

    }
}
