package ifStatement;

import java.util.Scanner;

public class elseTask2 {
    public static void main(String[] args) {
        //Task
        //find out if your zip code is even or number

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your zip code ");
        int zip = input.nextInt();
        if(zip%2==0){
            System.out.println("Your zip code is even number ");
        }else{
            System.out.println("Your zip code is odd number ");
        }
    }
}
