package string;

public class MethodChains {
    public static void main(String[] args) {
         String name = "        David  ";

        String n =  name.substring(5).substring(2).toUpperCase().replace("A","xxx")
                 .trim();

        char ch =  name.substring(5).substring(2).toUpperCase().replace("A","xxx")
                .trim().charAt(1);
        System.out.println(ch);
        System.out.println(n);
    }
}
