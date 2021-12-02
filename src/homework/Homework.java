package homework;

import java.util.Scanner;
class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Please do all coding here


        System.out.println("Enter a random word");
        String word = input.next();

        System.out.println("Enter number of letter that word consists");
        int number = input.nextInt();

        System.out.println(word.length() == number);
        System.out.println("Enter a letter that you want to find an index");
        String letter = input.next();
        System.out.println(word.contains("a"));
        System.out.println(word.indexOf("c"));
    }
}