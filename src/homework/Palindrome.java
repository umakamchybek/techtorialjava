package homework;

public class Palindrome {
    public static void main(String[] args) {

        /*
        Write a program in Java to check whether a String is a palindrome or not.
If string is a palindrome print "palindrome" if not print "not palindrome"
NOTE:
A string is said to be a palindrome if the string read from left to right
is equal to the string read from right to left.
For example, ignoring the difference between uppercase and lowercase letters,
the string "iTopiNonAvevanoNipoti" is a palindrome,

Test Data :
Input a number: Civic
Expected Output : palindrome

Input : Java
Expected Output: not palindrome

Input: Hannah
Expected Output : palindrome

Input : Try
Expected Output : not palindrome
         */
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
