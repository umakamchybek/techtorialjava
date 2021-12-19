package loops.forLoop;

public class InfiniteFoeLoop {
    public static void main(String[] args) {
        for(int k = 0; k<5; k++){
            System.out.println("David");
        }
        //infinite loop
        int x = 0;
        for(; ;  x++ ){
            System.out.println("Zack");

           // System.out.println(x);this statement will
            // not be reached out since there is infinite loop before it
        }
    }
}
