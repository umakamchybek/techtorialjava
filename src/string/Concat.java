package string;

public class Concat {
    public static void main(String[] args) {

        String test1 = "Chicago";

        String number = "1";
        number+="2";
        number+=2;

        System.out.println(number);//122 is the outcome


        //String has built methods/functions  you can call by using your variables

        String test = "Chicago";
        test = test.concat(" is the best");// chicago is the best
       test = test.concat(" in the summer ");// chicago is the best in the summer
        System.out.println(test);//chicago is the best in the summer

        test+=test.concat(" EVER");
        System.out.println(test);//Chicago is the best in the summer Chicago is the best in the summer  EVER


    }
}
