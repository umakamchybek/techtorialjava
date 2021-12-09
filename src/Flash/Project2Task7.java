package Flash;

import java.util.Scanner;

public class Project2Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any two words");
        String words = input.nextLine();// Natural Black
        int secondSpace = words.indexOf(" ",words.indexOf(" ")+1);
        System.out.println(words.substring(0,secondSpace)+
                words.substring(secondSpace,secondSpace+2).toUpperCase()+
                words.substring(secondSpace+2));

    }
}
