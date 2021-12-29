package homework;

import java.util.Scanner;

public class SumOf1N {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms of series :");
        double num = input.nextInt();
        double result = 0;
        for (double i = 0; i < num; i++) {
            result += 1.0 / (i + 1);
        }
        System.out.println(result);



    }
}
