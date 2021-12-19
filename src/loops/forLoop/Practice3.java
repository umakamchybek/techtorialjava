package loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every letter from the string
        //print index number of the letter and * together >>>>0*T


        String str= "Today is snowynnnn";
        for(int i=0; i< str.length(); i++){
            System.out.print( str.charAt(i)+ "*"+ i + " ");

        }
        System.out.println(" ");
        //print out only letter "y" from the string
        for(int index=0;index<str.length();index++ ){
            if(str.charAt(index)=='y') {
                //System.out.println(str.charAt(index));
                System.out.println(index + "*" +str.charAt(index));
            }
        }
        //count the number of letter 'n' in the given string
        int count = 0;

        for(int index=0;index<str.length();index++ ){
            if(str.charAt(index)=='n') {

                count++;

            }
//it will print every time
        }
        System.out.println("There are:" + count + " n letters");
    }
}
