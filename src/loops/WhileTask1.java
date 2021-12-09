package loops;

import java.util.Scanner;

public class WhileTask1 {
    public static void main(String[] args) {
        /*
        //get a string from user and print out
        every letter from given string separated by comma
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a string value");
        String str = input.nextLine();
        int i = 0;

        while (i< str.length()){

            System.out.print(str.charAt(i) + " ,");
            i++;

        }
        //print those letters end to beginning
        System.out.println();

        int lastIndex = str.length()-1;
        while (lastIndex>=0){
            System.out.print(str.charAt(lastIndex) + " ,");
            lastIndex--;
        }
        // count how many lower case letters in the given string and print out


    }

}
