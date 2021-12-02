package ifStatement;

public class elsePractice {
    public static void main(String[] args) {
        boolean myLicence=true;
        if((myLicence==true)){
            System.out.println("You can enjoy your driving");
        }else{
            System.out.println("DMV is next door, please visit");
        }
        int num=1234;
        if(num<24){
            System.out.println("yaaaay");
        }else {
            System.out.println("this prints out from else block");
        }
        //==========================

        if('A'!='A')
            System.out.println("*************");
        else
            System.out.println("!!!!!!!!!!!!!!!");

        /*
        ==Task===
    when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        calculate and print total discount and payment in each case
         */
    }
}
