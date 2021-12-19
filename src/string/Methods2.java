package string;

public class Methods2 {
    public static void main(String[] args) {
        String flower = "Rose";

        // indexof



        int indexofR = flower.indexOf('R');//0
        int intexofR1 = flower.indexOf("R");//0
        System.out.println("first implementation "+indexofR);//0
        System.out.println("second implementation " + intexofR1);//0

        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("o,s"));//-1
        System.out.println(flower.indexOf("R"));//0
        System.out.println(flower.indexOf("Rose"));//0
        System.out.println(flower.indexOf("rose"));//-1
        System.out.println(flower.indexOf("Roses"));//-1
        System.out.println(flower.indexOf("se"));//2

        String object = "umbrellam";
        System.out.println("===>" + object.indexOf("e",6));//-1 because there is no 'e' after 6th index
        System.out.println(object.indexOf("l"));//5
        System.out.println(object.indexOf('l',6));//6
        System.out.println(object.indexOf('m', object.indexOf('m')+1));//8
        System.out.println(object.length());//9

        String sentence = "I love lilies";

        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));//9



        // toUppercase()---> makes your string to uppercase



        System.out.println(sentence.toUpperCase());//I LOVE LILIES
        System.out.println(sentence);//I love lilies


        //toLowerCase()----> makes string as lowercase


        System.out.println(sentence.toLowerCase());//i love lilies
        System.out.println(sentence);//I love lilies


        //think about making single letter uppercase from a string



        String str = "Just do it";

        // indexOf()---> returning number
        //charAt()---> returning char
        char letter = str.charAt(str.indexOf("d"));//
        System.out.println(letter);//d

        String str2= "";
        str2+=letter;
        System.out.println(str2.toUpperCase());



    }
}
