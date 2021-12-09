package Flash;

import java.util.Scanner;

public class Project2Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three different ingredients for the product on the same line");
        String ing1= input.nextLine();
        String ing2= input.nextLine();
        String ing3= input.nextLine();

        System.out.println(" Please enter an integer number");
        int num = input.nextInt();

        String ing1Result = (num++)+ing1.substring(1);
        String ing2Result = (num++)+ing2.substring(1);
        String ing3Result = num+ing3.substring(1);

        System.out.println(" The output is:  " + ing1Result + " ");
        System.out.println(ing2Result+ " ");
        System.out.println(ing3Result);


    }
}
