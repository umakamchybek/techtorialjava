package string;

public class Methods5 {
    public static void main(String[] args) {
        String word = "Sunday";


        // replace();


        String updatedWord = word.replace('a','$');
        System.out.println(updatedWord);//Sund$y

        String updatedWord1 = word.replace("Sun", "Satur");
        System.out.println(updatedWord1);//Saturday
        System.out.println(word.replace("sun", "Satur"));//Sunday
        String code = "java";
        System.out.println(code.replace('a', '%'));




    }
}
