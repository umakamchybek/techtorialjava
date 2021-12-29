package objects;

public class MathTestPractice {
    public static void main(String[] args) {

        MathPractice object = new MathPractice();

        object.sum();
        object.total(6,8);
       // System.out.println(object.sum());
        //you can't use method which has void return type in the sout

     int a =object.sum2(2,3);

     String str = object.speak();
        System.out.println(str);
        System.out.println(object.speak());


        // call numberToString method and do concatination
        //with yor first and last name and print it out

        String str1 = object.numberToString(8.7);
        str1=str1.concat("Uma");
        System.out.println(str1);

        System.out.println(object.numberToString(3.4).concat("Alex"));


    }
}
