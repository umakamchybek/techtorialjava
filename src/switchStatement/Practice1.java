package switchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        get a number between 1-4 from user
        print out name if a season as:
        1-winter
        2-spring
        3-summer
        4-autumn
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number between1-4 to select a season"+
                "1-winter, 2 -spring,3-summer,4- autumn");
        int num=input.nextInt();

        switch (num){

            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("autumn");
            default:
                System.out.println("None of the above");
        }
    }
}
