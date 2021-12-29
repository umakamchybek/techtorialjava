package objects;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodPractice {
    /*
    `create a method that will calculate age of a person,
    `does not return age,
    `will take birth year as parameter,
    `user provides the birth year
    `will print age of person
     */

    public void ageCalculator(int birthYear){

        int age = LocalDateTime.now().getYear() -birthYear;
        System.out.println("Your age is: "+age);
    }
    //************************
    public int ageCalculator(int birthYear,String name) {

        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println("Your age is: " + age);
        System.out.println("Overloaded ageCalculator method");
        return age;
    }

    //=====================================================

    //create a method that will take int array as a parameter
    //it will calculate sum of the numbers in this array
    //it will return the sum as double


    public double sumOfArrayElements(int[] ids){

        double sum =0;
        for (int id:ids) {
            sum +=id;
        }
        return sum;

    }


}
