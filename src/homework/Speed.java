package homework;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        /*
        The user using a scanner enters the current speed and target speed .
In every 1-sec car's speed will increase 10mil. Please find the total number of sec
to reach your target speed using a while loop.
Example:
CurrentSpeed: 6
Target Speed: 20
Output: 2. -> Because in two seconds user can reach the target speed.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current speed");
        int currentSpeed=input.nextInt();

        System.out.println("Enter target speed");
        int targetSpeed=input.nextInt();
        int sec=0;

        while(currentSpeed<=targetSpeed){
            currentSpeed+=10;
            sec++;

        } System.out.println(sec);



    }
}
