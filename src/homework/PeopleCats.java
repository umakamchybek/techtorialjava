package homework;

import java.util.Scanner;

public class PeopleCats {
    public static void main(String[] args) {
        /*
        Create two integer variables using scanner for cats, and people.
      If the number of cat is bigger than number of people print
     "Too many cats! The world is meowed!",
     if the number of cats are smaller than number of people print
      "Not many cats! The world is saved!".
      Lastly if they equal to each other print "Wow! There is a cat for every person."

      Note: Please use if else statement for this question.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of cats");
        int cats =scanner.nextInt();

        System.out.println("Please enter the number of people");
        int people= scanner.nextInt();

        if(people<cats){
            System.out.println("Too many cats!  The world is meowed!");
        }else if(people>cats){
            System.out.println("Not many cats!  The world is saved!");
        }else if(cats==people) {
            System.out.println("Wow! There is a cat for every person.");
        }
    }
}

