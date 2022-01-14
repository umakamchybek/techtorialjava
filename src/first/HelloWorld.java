package first;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("number ");
//        int number = 5;
//        int number2 = 6;
//        System.out.println("Number: " + number);
//        System.out.println("Numbers are: " + number + number2);
//        System.out.println("Numbers are: " + number + "and" + number2);
//        int number3 = 20;
//        System.out.println(number + number2);
//        System.out.println("Numbers are:" + (number + number2));
//        System.out.println("The sum of my numbers is:" + (number + number2));
        int[] array={2, 1, 3, 5};

        for( int i =0; i<array.length-2; i++){
            if( array[i]%2!=0 && array[i+1]%2!=0 && array[i+2]%2!=0){
                System.out.println("true");
            }

            }

    }
}
