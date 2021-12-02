package ifStatement;

import java.util.Scanner;

public class ifPracticeTask {
    public static void main(String[] args) {
         /*
         Ask user to enter a single word
         if the word's firs letter is
         M---> there is a day starts with m>>Monday
          */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a single word ");
        String word = input.nextLine().toUpperCase();

        if (word.startsWith("M"))
           //||word.startsWith("m"))
        {
            System.out.println("Monday");
        }
        if (word.startsWith("T")){
            System.out.println("Tuesday/Thursday");
        }
        if (word.startsWith("W")){
            System.out.println("Wednesday");
        }
        if (word.startsWith("S")){
            System.out.println("Saturday/Sunday");
        }

        if(!word.startsWith("M")&&!word.startsWith("T")&&!word.startsWith("W")&&!word.startsWith("F")&&!word.startsWith("S")){

          System.out.println(" None of the above");}


    }
}
