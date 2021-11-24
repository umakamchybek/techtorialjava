package primitives;

public class ArithmeticPractice {
    public static void main(String[] args) {// main

        //addition ---> +
        int num1 = 3;
        int num2 = 4;

        System.out.println("total is:" +(num1+num2));
        System.out.println(num1+num2);

      int sum =  num1 + num2;
        System.out.println(sum);

        //substruction ---> +

        int difference;
        difference = 10 - num2;
        System.out.println("Result is:"+ difference);


        //multiplication ---->*

        double product = difference*num2;
        System.out.println(product);


        //division ---/

        double division =product/3;
        System.out.println(division);

        product = product*division;
        System.out.println(product);

        int division2 =17/2;
        System.out.println(division2);
        double division3 = 17/2;
        System.out.println(division3);

        float division4 = 17/2f;
        System.out.println(division4);

       // remainder ----> leftover ---> % (modulus)

        int a = 11;
        int b = 5;

        int remainder1 = a%b;


        System.out.println("The leftover of 11/5 is = "+remainder1); //1


        int x = 13;
        int y = 5;

        int remainder2 = x%y;
        System.out.println(remainder2); //3
        System.out.println(25%21);//4
        System.out.println(25%x); //12

        int result = a + b * x - y /  a * b + x % 2;
        System.out.println(result);

        //casting






    }
}
