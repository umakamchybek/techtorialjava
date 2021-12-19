package loops.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {
        String str = "dotokl";
        String reverse = "";
        for(int i=str.length()-1;  i>=0; i--){

            reverse=reverse+str.charAt(i);

        }
         if(reverse.equalsIgnoreCase(str)) {
             System.out.println("it is a palindrome string");
         }else{
             System.out.println("it is not a palindrome string");
         }
         //
        int number=1234321;
         String str1=""+number;
    }
}
