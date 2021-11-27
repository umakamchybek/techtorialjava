package string;

public class Methods2 {
    public static void main(String[] args) {
        String flower = "Rose";

        int indexofR = flower.indexOf('R');
        int intexofR1 = flower.indexOf("R");
        System.out.println("first implementation "+indexofR);
        System.out.println("second implementation " + intexofR1);

        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("o,s"));//-1
        System.out.println(flower.indexOf("R"));//0
        System.out.println(flower.indexOf("Rose"));//0
        System.out.println(flower.indexOf("rose"));//-1
        System.out.println(flower.indexOf("Roses"));//-1
        System.out.println(flower.indexOf("se"));//2

        String object = "umbrellam";
        System.out.println(object.indexOf("l"));//5
        System.out.println(object.indexOf('l',6));//6
        System.out.println(object.indexOf('m', object.indexOf('m')+1));//8
        System.out.println(object.length());//9

        String sentence = "I love lilies";

        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));//9

        // toUppercase()---> makes your string to uppercase

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);

        //toLowerCase()----> makes string as lowercase
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence);


        //think about making single letter uppercase from a string

        String str = "Just do it";

        // indexOf()---> returning number
        //charAt()---> returning char
        char letter = str.charAt(str.indexOf("d"));

        String str2= "";
        str2+=letter;
        System.out.println(str2.toUpperCase());



    }
}
