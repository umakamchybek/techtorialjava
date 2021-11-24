package primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        int num1 = 25;
        System.out.println(num1++);//shows 25 but it is 26
        System.out.println(num1);//shows 26
        num1++;

        System.out.println(num1);//27



        int count = 5;
        System.out.println(count++);//5
        System.out.println(++count);//7

        //===================
        int number = 8;


        System.out.println(number--);//shows 8 it is 7
        System.out.println(number--);//shows 7 it is 6
        System.out.println(--number);// shows 5 it is 5


        number++;
        System.out.println( number++ +number++);//shows 13 the number is 8
        System.out.println(number);

        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result);//3
        System.out.println(number);//7

        int a = ++number;
        System.out.println(a);//8





    }
}
