package string;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //task:
        //by using scanner ask user to provide his/her gender, full name and birth year in the following format
        // F - Jenny brown - 1999
        /*
          -check if the string starts with F
          -check if the string ends with M
          -check if the string contains your name
          -check if the string ending with birth year of 2000
            -replace '-' with '/'
         */
        System.out.println("Please enter your gender,full name and birth year in the following format: F - Jenny Brown" +
                " - 1999 ");
        String info = scanner.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Efe"));
        System.out.println(info.endsWith("2000"));
        System.out.println(info.replace('-','/'));






    }
}
