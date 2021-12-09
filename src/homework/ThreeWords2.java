package homework;

import java.util.Scanner;

public class ThreeWords2 {
    public static void main(String[] args) {
        /*Using Scanner ask user to enter one string value with three words
        1- Print first letter of each word together
        2- Print last letter of each word together
        3- Print length of each word
         (First print first word's length then print second word's length lastly print last word's length)
         Example: Please enter value: "Java String Test" Output: JST agt 4 6 4

         */
        System.out.println("Please enter string with three words");
        //This string has three words
        //i need to find each word individually
        //java script coding
        //spaces
        //if i need to work just specific part of the string
        Scanner input = new Scanner(System.in);
        String threeWords =input.nextLine();
        //substring(begins, ends)
        //substring(0,3)
        int indexOfSpace = threeWords.indexOf(" ");
        //returns the indexof character we provided in method
        //charAt returns the character of the index you provided
        String word1 = threeWords.substring(0,threeWords.indexOf(" "));
        //removing the first word
        String lastTwoWords = threeWords.substring(indexOfSpace+1);
        System.out.println(lastTwoWords);
                int secondIndexOfSpace= lastTwoWords.indexOf(" ");
                //
        String word2 = lastTwoWords.substring(0,secondIndexOfSpace);
        System.out.println(word2);
        String word3 =  lastTwoWords.substring(secondIndexOfSpace+1);
        System.out.println(word3);
        //first letters
        System.out.println(""+word1.charAt(0)+word2.charAt(0)+word3.charAt(0));

        //second letters
        System.out.println(""+word1.charAt(word1.length()-1)+word2.charAt(word2.length()-1)
                +word3.charAt(word3.length()-1));

        System.out.println(word1.length());
        System.out.println(word2.length());
        System.out.println(word3.length());

    }
}
