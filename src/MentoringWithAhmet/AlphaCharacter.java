package MentoringWithAhmet;

public class AlphaCharacter {
    public static void main(String[] args) {
        //PRINT OUT ALPHABETICAL,DIGIT, AND SPECIAL CHARACTERS FROM
//THE STRING SEPERATELY
//String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
//1-Print out alphacharacter
//2-Print out digit
//3-Print out special character
//main method

String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";

      String onlyAlphabetical="";
      String onlyDigit = "";
      String onlySpecial="";

        for( int i = 0; i< given.length(); i++){

            if(Character.isAlphabetic(given.charAt(i))){
                onlyAlphabetical+=given.charAt(i);
            }else if(Character.isDigit(given.charAt(i))){
                onlyDigit+=given.charAt(i);

            }else{
                onlySpecial+=given.charAt(i);
            }
        }
        System.out.println(onlyAlphabetical);
        System.out.println(onlyDigit);
        System.out.println(onlySpecial);

    }


}
