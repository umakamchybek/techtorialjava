package primitives;

public class CastingPractice {
    public static void main(String[] args) {

        int number1 = 23;
        long l1= number1;// implicit casting happens by java

        short sh1 = (short)number1; //explicit casting

        byte by1 = 1;

        byte by2 = 2;

      /* short sum1 = by1+by2; compile time error (due ti numeric promotion
        java wants to store the results in to larger data type (int)
        thats why it is not compiling)*/

        short sum2 = (short)(by1+by2);

        //short sum3 = (short)by1+ (short)by2; this is still individual casting for each variable result is not casting yet

        int price = (int)750.99;
        System.out.println(price);

        double samsung = 900.45;
        int priceSamsung = (int)samsung;
        System.out.println(samsung);
        System.out.println(priceSamsung);



    }
}
