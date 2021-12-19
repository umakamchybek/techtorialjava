package string;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {

        //Task 1
         //ask user to enter an integer number
        //we will find out if this an even number or not
        //input is 7
        //Output 7 is  even number false
        //input is 8
        //Output 8 is even number true
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your integer number ");
        int number = scanner.nextInt();
        // if remainder with 2 gives 0 this number will be even
        //otherwise it is odd
        boolean isEven = number%2==0;
        System.out.println(number + "is even number " +isEven);



        //Task 2
        //Ask user to enter two integer number
        //First integer you provide should be bigger than second number
        //we will print out  True
        //if the second number bigger than the first number
        //we will print out False

        System.out.println("Enter your first integer number ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second integer number but smaller than first one ");
        int secondNumber = scanner.nextInt();
         boolean isFirstBigger = firstNumber>secondNumber;

        System.out.println(isFirstBigger);

        // Task 3
        //to be able to graduate from school
        //student needs
        //85% attendancy
        //80 or higher grade
        //70% of homework
        //create a program for teacher
        //teacher will enter all these variables and
        //if student passes you will print true for teacher
        //if student fails you will print false for teacher

        System.out.println(" Student attendancy is ");
        int attendancy = scanner.nextInt();

        System.out.println(" Student grade is ");
        int grade = scanner.nextInt();

        System.out.println("Student homework is ");
        int homework = scanner.nextInt();

        // How can i print for all of them
        boolean isAttendancy = attendancy>= 85;
        boolean isGrade = grade >= 80;
        boolean isHomework = homework>=70;


        boolean isPass = isAttendancy && isGrade  && isHomework;

        System.out.println(isPass);




    }
}
