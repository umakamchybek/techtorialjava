package ifStatement;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        //assume that user is using military style time - 1 - 23
        // print out Good morning or good afternoon
        //for the hours of morning or afternoon
        //ask user to enter only hour for the time
        //if the hour is less than 12 print good morning
        //if the hor is more than 12 print good afternoon
        //if the hour is more than 18 print good evening

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the military time as: 0-23");
        int time = input.nextInt();

        if(time<12&&time>=0){
            System.out.println("Good morning");
        }
        if(time>=12&&time<18){
            System.out.println("Good afternoon");}
        if(time>=18&&time<24){
            System.out.println("Good evening");
        }
        if(time<0||time>23){
            System.out.println("Go to sleep");
        }


    }
}
