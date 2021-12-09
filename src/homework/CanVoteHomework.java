package homework;

import java.util.Scanner;

public class CanVoteHomework {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Your full name");
        String fulllName = input.nextLine();
        System.out.println("Your code");
        String stateCode = input.nextLine();
        System.out.println("Your city");
        String city = input.nextLine();
        System.out.println("your gender");
        String gender = input.nextLine();
        System.out.println("your age");
        int age = input.nextInt();
        Boolean canVote = fulllName.startsWith("A") && fulllName.endsWith("V") && stateCode.startsWith("I") && stateCode.endsWith("L")
                && age > 18 && gender.endsWith("F") && city.length() <= 10;
        System.out.println(canVote);

        //&(one) sign will check all the conditions

        //&&(double) will check only the first FALSE and it won't check the rest of the condition
    }
}
