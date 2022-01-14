package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("David");
        names.add("John");
        names.add("Jim");
        names.add("Aleks");
        System.out.println(names);

        // convert from Arraylist to Array

        Object[] arrayNames = names.toArray();
        System.out.println(Arrays.toString(arrayNames));

        arrayNames[arrayNames.length]="Dima";
        System.out.println(Arrays.toString(arrayNames));




    }
}
