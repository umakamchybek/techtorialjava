package loops.ForEach;

public class ForEachPractice2 {
    public static void main(String[] args) {

        char[]chs={'A','4','&','z', '3','u','*'};
        //print letters only


        for(char ch: chs){
            if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
                System.out.println(ch);
            }

        }
        //================================================

        for(char letter: chs){
            if(Character.isAlphabetic(letter)){
                System.out.println(letter);
            }else  if(Character.isDigit(letter)){
                System.out.println("number" + letter);
            }else{
                System.out.println("symbols" + letter);
            }
        }




    }
}
