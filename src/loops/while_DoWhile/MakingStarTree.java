package loops.while_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
          /*
        -Ask user to provide a number between 3 to 10
  - make a star tree for that many line
  (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number between 3-10");
        int num = input.nextInt();

        int x=0;
        String str="*";
        do{

            System.out.println(str);
            str+="*";
            x++;
        }while (x<num);
    }
}
