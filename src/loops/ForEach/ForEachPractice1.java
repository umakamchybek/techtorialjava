package loops.ForEach;

public class ForEachPractice1 {
    public static void main(String[] args) {

        double[] checks={2540,10000,100000,65.50,1.99};

        //by using for each loop,
        double total=0;

        for(double check:checks){

           //System.out.println(check);
           total+=check;
        }
        System.out.println(total);


    }
}
