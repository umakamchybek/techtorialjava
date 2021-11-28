package string;

public class Methods6 {
    public static void main(String[] args) {
         String name = "   Techtorial Academy is located at Des plains   ";

         // trim(); it will remove spaces before and after the String

        String updatedName = name.trim();
        System.out.println(updatedName);
        System.out.println(name);

        //subString()

        String part1 = updatedName.substring(4);
        System.out.println(part1);
        String part2 = updatedName.substring(4,12);// the char at the first index included but
                                                   // character at the second index is not
        System.out.println(part2);


    }
}
