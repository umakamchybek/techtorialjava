package switchStatement;

public class SwitchPractice {
    public static void main(String[] args) {

        int number = 1200;
        System.out.println("Before switch");

        switch(number){
//            default:
//                System.out.println("This is the default case");
//                break;
            case 100:
                System.out.println("This is the first case");
                break;
            case 110:
                System.out.println("this is the second case");
                break;
            case 120:
                System.out.println("this is the third case");
                break;
            case 123:
                System.out.println("this is the fourth case");
                break;
            case 130:
                System.out.println("this is the fifth case");
                break;


        }
        System.out.println("After switch");
    }
}
