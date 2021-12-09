package ifStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //passport
        //visa
        //ticket

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a passport? yes/no");

        String passport = scanner.nextLine();

        if(passport.equalsIgnoreCase("yes")){
            System.out.println("Do you have a visa? Yes/no?");
            if(scanner.nextLine().equalsIgnoreCase("Yes")){
                System.out.println("Do you have a ticket? yes/no");
                if(scanner.nextLine().equalsIgnoreCase("yes")){
                    System.out.println("Enjoy your stay");
                }else{
                    System.out.println("please get a ticket");
                }

            }else{
                System.out.println("You need to get visa");
            }


        }else{
            System.out.println("Please get a passport first");
        }
    }
}
