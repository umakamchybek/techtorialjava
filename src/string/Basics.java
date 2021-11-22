package string;

public class Basics {
    public static void main(String[] args) {


        String word = "Tech";

        System.out.println(word);

        String word2 = new String("Tech");
        System.out.println(word2);

        String word3 = "Tech"+ "Torial";
        System.out.println(word3);


        System.out.println(word + "JAVA");//TechJAVA
        System.out.println(word + "77");//Tech77
        System.out.println(word + 7 + 8);//Tech78
        System.out.println(word + (7 - 8));//Tech-1

        System.out.println(word + 7 * 8);//Tech56
        System.out.println(7+8 + word + 7+8); // 15Tech78

        word += "torial";// word = word+"torial";
        System.out.println(word);//Techtorial

        word+=33;
        System.out.println(word);//Techtorial33






    }
}
