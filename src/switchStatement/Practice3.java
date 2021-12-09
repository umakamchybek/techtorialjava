package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        based on the name of the shape
        calculate the area of that shape
        get length and width for rectangle
         get height and base for triangle from user to use them in calculations
        print out name of the shape and area of that shape
        -triangle, rectangle
        rectangle=l*w   triangle=(base*height)/2

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a geometrical shape? Triangle/Rectangle");
        String shape =input.nextLine().toLowerCase();

        switch(shape) {
            case "triangle":
                System.out.println("Please enter the height of the triangle");
                double h = input.nextDouble();
                System.out.println("Please enter the base of the triangle");
                double b = input.nextDouble();
                System.out.println("the area of triangle " + (b * h) / 2);
                break;
            case "rectangle":
                System.out.println("Please enter the length of the rectangle");
                double l = input.nextDouble();
                System.out.println("Please enter the width of the rectangle");
                double w = input.nextDouble();
                System.out.println("the area of rectangle " + l * w);
                break;
            default:
                System.out.println("Your shape selection is not an option");

        }
        double d=2.5;//incompatible types
        short s = 2;
        boolean b = true;//incompatible
        long l=2;//incompatible

        switch (s){
            case 1:
                System.out.println("******");

        }

    }
}
