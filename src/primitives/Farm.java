package primitives;

public class Farm {
    public static void main(String[] args) {

        /*
        in a farm, there are 12 cows and 23 chickens
        1- find the total legs of the animals in the farm and print out
        2- if each cow costs 2345$ and each chicken costs 23.99$
           find the total worth of these animals and print out

         */
//task 1
        int cow = 12;
        int chick = 23;

        int totalLegs = cow*4 + chick*2;
        System.out.println(totalLegs);


        //task 2

        double cow$ = 2345;
        double chick$ = 23.99f;

        double total = cow$ *cow + chick$ * chick;

        System.out.println(total);


    }
}
