package loops.forLoop;

public class Practice2 {
    public static void main(String[] args) {
        //print out numbers between 0-5 decreasing by using for loop

        for(int num=5;num>=0; num--){
            System.out.println( "My number is:"+num);
        }
        //find the sum of numbers between 1-5 by using for loop
        int sum = 0;
        for(int num1=1; num1<=5; num1++ ){

       sum+=num1;
        }
        System.out.println("The sum is: " + sum );
    }
}
