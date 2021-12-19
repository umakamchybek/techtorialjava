package homework;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        System.out.println("Enter the number of line");
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        // 2
        // Loop has to run same time with number of line
        int numbersOfThePyramid = 1;

        for (int i=1;i<=line ;i++ ) {
            // Now number of line and i is mathcing

            // i represents the line number i am in
            // This loop has to run i time
            for (int j=1;j<=i ;j++ ) {
                // When I am printing on this line should I print on everything same line?
                // If I know this the last number i am printing in the line
                // I should remove the space
                if(j==i){
                    System.out.print(numbersOfThePyramid++);
                }else{
                    System.out.print(numbersOfThePyramid++ +" ");}
            }
            System.out.println();
        }

    }
}
