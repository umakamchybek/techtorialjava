package wrapper;

import objects.Car;
import objects.Cat;
import objects.Student;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        byte b=2;
        Byte bt= new Byte(b);
        System.out.println(bt);
        short s = 7;

        Short sh = new Short(s);
        System.out.println(sh);

        Character ch= new Character('a');
        System.out.println(ch);

        Integer integer = new Integer(4);
        Integer integer1 = new Integer("4");
        System.out.println(integer1);
        int integer2=new Integer("5");
        System.out.println("--------------->"+integer2);


        Float fl = new Float(4.4);

        Double db= new Double(5.4);

        Long ln= new Long(12345);

        Boolean bl= new Boolean(true);
        System.out.println(bl);
        Boolean bl1= new Boolean("true");
        System.out.println(bl1);
        Boolean bl2= new Boolean("123");
        System.out.println(bl2);



        int i= new Integer(22);// UnBoxing---> when java converts Wrapper class object to primitive daya;

        Integer number = 3;//Autoboxing when you store primitive data to Wrapper class object
        System.out.println(number.toString().concat("dgjgfujjk"));

        //array
        int[] numbers={i,number};

        System.out.println(number*25);

    }
}
