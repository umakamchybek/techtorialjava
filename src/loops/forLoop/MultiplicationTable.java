package loops.forLoop;

public class MultiplicationTable {
    public static void main(String[] args) {

        //create a multiplication table for the numbers 1-5

        for(int i =1; i<6; i++){
             for(int k =1; k<11; k++){

                 System.out.println(i + " * "+k +" = "+(i*k));
             }
        }


    }
}
