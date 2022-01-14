package arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {



    /*===TASK===:
-Create an ArrayList that will store 5 fruit names
-Print out stored values by using for Loop
*/
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Strawberry");
        fruits.add("Peach");




//        for(int i=0; i< fruits.size();i++){
//            System.out.println(fruits.get(i));
//        }

        for( String fruit: fruits){
            System.out.println(fruit);
        }

        printFruits(fruits);
        removeElement(fruits);


    }
    // after the main method

    public static void printFruits(ArrayList <String> fruits){
        for(String fruit: fruits)

        if(fruit.length()>=5){
            System.out.println(fruit);
        }
    }

    public static void removeElement(ArrayList <String> fruits){

        for(int i=0; i<fruits.size();i++){

            if(fruits.get(i).length()<=4){

               fruits.remove(i);
            }

        }
        System.out.println(fruits);

    }

}
