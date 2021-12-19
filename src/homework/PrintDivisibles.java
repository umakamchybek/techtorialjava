package homework;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to provide starting and ending numbers.
Print the numbers divisible by 3 and 5 between given number AND ONLY print count
of those numbers which is divisible by 3 and 5.
EXAMPLE:
First number: 5
Second number: 65
Output:
4          //-> Because between 65 and 5 there is only 4 number divisible by 3 and 5 which
//-> are 15 30 45 and 60 but in this task please do not print anything else just the
// count of number which are divisible by 3 and 5.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a starting number");
        int startNumber = input.nextInt();
        System.out.println("Enter an ending number");
        int endNumber = input.nextInt();
        int count = 0;
        for (   ; startNumber <= endNumber ; startNumber++ ){
            if (startNumber%3==0 && startNumber%5==0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
