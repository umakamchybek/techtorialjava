package ifStatement;

import java.util.Scanner;

public class elseIfPractice1 {
    public static void main(String[] args) {
        /*
        get three test results
         from user and calculate the average
        of those three tests based on the average score:
        -print ot letter grade for this student
        average --->100-90--->your letter grade is A
        average is ---> 89-80---> your letter is B
        average is--->79-60---C
        less than60----you should take the course again
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first test score");
        int score1= input.nextInt();
        System.out.println("please enter your second test score");
        int score2= input.nextInt();
        System.out.println("please enter your third test score");
        int score3= input.nextInt();
        int average =(score1+score2+score3)/3;
        if(average>=90&&average<=100){
            System.out.println("Your score is A");
        } else if(average>=80&&average<=89){
            System.out.println("Your score is B");

        }else if(average>=60&&average<=79){
            System.out.println("Your score is C");
        }else{
            System.out.println("You should take the course again");
        }
    }
}

