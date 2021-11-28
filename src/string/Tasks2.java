package string;

public class Tasks2 {
    public static void main(String[] args) {

        /*
        ===Task==
String str = " Zero to Ten  ";
- change 'Ten' with/to 'HERO'
- make all of the string uppercase
- remove all spaces
- get only first three letter
- print the length of those three letters as ==> "The length of final verison is: +  <length>"
Collapse

         */

        String str = "  Zero to Ten   ";
        str = str.replace("Ten","HERO");
        System.out.println(str.replace("Ten", "HERO"));
        str = str.toUpperCase();
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.replace(" ",""));
        str = str.substring(2,5);
        System.out.println(str);

        System.out.println("The length of final version is: " + str.length());
        //method chaining
        /*
        String str = " Zero to Ten  ";
- change 'Ten' with/to 'HERO'
- make all of the string uppercase
- remove all spaces
- get only first three letter
- print the length of those three letters as ==> "The length of final verison is: +  <length>"
         */

        str = " Zero to Ten  ";

        str.replace("Ten","HERO").toUpperCase().trim().replace("  ","").substring(0,3).length();
        System.out.println( str.replace("Ten","HERO").toUpperCase().trim().replace("  ","").substring(0,3).length());
        int a = str.replace("Ten","HERO").toUpperCase().trim().replace("  ","").substring(0,3).length();
    }
}
