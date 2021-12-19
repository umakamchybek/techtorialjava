package primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;

        int result = --a +--b + a++ * 2 - b++ * a--;
        System.out.println(result);//0
        System.out.println(a);//6
        System.out.println(b);//4

        // task
        // total donuts are - 12
        // each donut is 2$
        //print out how much the customer will pay today for each cas

        int donutPrice =2;
        int totalDonut = 12*donutPrice;
        int result1 = totalDonut;

        System.out.println("Today you pay at KK >>"+ (--result1));//23
        System.out.println("Today you pay at DD >>" + (++result1));//24
        System.out.println("Tomorrow you pay at DD>>" +(--result1));//23

       char ch= 'a';

        System.out.println(ch);
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(--ch);

    }
}
