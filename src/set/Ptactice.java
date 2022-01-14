package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ptactice {
    public static void main(String[] args) {

        HashSet <String > colorsHash = new HashSet<>();
        LinkedHashSet <String > colorsLinked= new LinkedHashSet<>();

        TreeSet <String> colorsTree= new TreeSet<>();

        colorsHash.add("white");   colorsLinked.add("white");   colorsTree.add("white");
        colorsHash.add("black");   colorsLinked.add("black");   colorsTree.add("black");
        colorsHash.add("blue");    colorsLinked.add("blue");    colorsTree.add("blue");
        colorsHash.add("pink");    colorsLinked.add("pink");    colorsTree.add("pink");
        colorsHash.add("green");    colorsLinked.add("green");   colorsTree.add("green");
        colorsHash.add(null);       colorsLinked.add(null);      //colorsTree.add(null);


        System.out.println(colorsHash);// no order
        System.out.println(colorsLinked);// inserting order
        System.out.println(colorsTree);  // ascending order from a-z

        System.out.println(colorsTree.descendingSet());

        Set<String> example = colorsTree.descendingSet();

        System.out.println(example);






    }
}
