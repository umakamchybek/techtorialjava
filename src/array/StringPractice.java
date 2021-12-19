package array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String[]names= new String[6];

        System.out.println(Arrays.toString(names));

        names[5]="Alex";
        names[4]="David";
        names[2]="Ana";
        names[0]="Jack";
        System.out.println(Arrays.toString(names));//
        System.out.println(names[3]);

        //show all values from names array one by one

        for(int i =0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
