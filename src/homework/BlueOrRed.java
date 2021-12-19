package homework;

import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {
        /*
 Using the scanner ask the user to enter any String value. If this
String has a color like red or blue with lower case print the red or
blue. Other wise do not print anything.
EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
         */
        Scanner input =new Scanner(System.in);
        System.out.println(" Please enter  the string value");
        String word= input.nextLine().toLowerCase();
        boolean ifRed= word.contains("r")&&word.contains("e")&&word.contains("d");
        boolean ifBlue = word.contains("b")&&word.contains("l")&&word.contains("u")&&word.contains("e");

        if(ifRed){
            if(word.indexOf("r")<word.indexOf("e")&&word.indexOf("e")<word.indexOf("d")){
                System.out.println("red");
            }

        }else if(ifBlue){
            if(word.indexOf("b")<word.indexOf("l")&&word.indexOf("l")<word.indexOf("u")&&
            word.indexOf("u")<word.indexOf("e")){
                int indexB= word.indexOf("b");
                int indexL=word.indexOf("l",indexB);
                int indexU=word.indexOf("u",indexL);
                int indexE= word.indexOf("e",indexU);

                if (indexB<indexL&&indexL<indexU&&indexU<indexE) {
                    System.out.println("blue");
                }
            }
        }


    }
}
