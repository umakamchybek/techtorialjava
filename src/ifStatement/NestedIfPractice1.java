package ifStatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which city you are?" );
        String city= scanner.nextLine();

        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("Which school do you go?");
            if(scanner.nextLine().equalsIgnoreCase("Techtorial")){
                System.out.println("Which batch are you in?");
                if(scanner.nextLine().equalsIgnoreCase("Batch 11")){
                    System.out.println("Congratulations!");
                }else{
                    System.out.println("Come to batch 11");
                }
            }else{
                System.out.println("Come to the Techtorial");
            }
        }else{
            System.out.println("Please visit Chicago");
        }
    }
}
