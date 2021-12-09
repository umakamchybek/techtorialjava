package homework;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string value");
        String str = input.nextLine();

        if(str.length()>=3){
            System.out.println(str.substring(1,str.length()-1));
        }else if(str.length()<=3){
            System.out.println(str);
        }
    }
}
