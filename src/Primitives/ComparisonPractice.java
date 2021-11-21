package Primitives;

public class ComparisonPractice {
    public static void main(String[] args) {

        float fl = 4.4f;
        int i = 4;
        //==
        System.out.println(fl==i);

        boolean comp1 = fl ==i;
        System.out.println(comp1);

        System.out.println(18==18);

        System.out.println('a'=='a');
        System.out.println("test"=="tesT");

        //!=

        int num1 = 55;
        int num2 = 66;

        boolean comp2 = num1!=num2;
        System.out.println(comp2);//true

        System.out.println(18!=18);// false

        // less than
        System.out.println(num1<num2);//true
        System.out.println(55<num1); // false
        System.out.println(num2<num1);//false

        System.out.println('c'<'c'); //false
        System.out.println('c'<'d');// true

    }
}
