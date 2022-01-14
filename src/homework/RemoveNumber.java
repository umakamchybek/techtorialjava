package homework;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        /*
        Create the int array with  numbers following,
 10,4,3,55,32,145,443,234,98,32 .
Then, using scanner  ask user to provide any number from given array, then remove the
value from array and put 0 instead of that number and PRINT the array.
If array doesn't contain the number PRINT "false".


Example:
Given Number:
145
Output:
  [10, 4, 3, 55, 32, 0, 443, 234, 98, 32]

Example 2:
Given Number:
2000
Output:
false

Example 2:
Given Number:
32
Output:
[10, 4, 3, 55, 0, 145, 443, 234, 98, 32]
         */
        System.out.println("Please enter number from array");

        int[] nums={10,4,3,55,32,145,443,234,98,32};

        Scanner scan= new Scanner(System.in);
        int userNum=scan.nextInt();
        boolean replaced=false;

        for( int i = 0; i<nums.length; i++){
            if(nums[i]==userNum){
                nums[i]=0;
                replaced=true;
            }
        }
        if(replaced){
            System.out.println(Arrays.toString(nums));
        }else{
            System.out.println("false");
        }
    }
}
