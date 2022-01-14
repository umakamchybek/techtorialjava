package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {

        ArrayList <String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Chicago");
        cities.add(1,"Boston");

        System.out.println(cities.get(1));
        System.out.println(cities);

        cities.remove("Chicago");
        System.out.println(cities);
        cities.remove("chicago");
        System.out.println(cities);


        ArrayList<String>  shoes = new ArrayList<>();
        shoes.add("nike");
        shoes.add("adidas");
        shoes.addAll(cities);
        System.out.println(shoes);

        shoes.remove("Boston");
        System.out.println(shoes);
        System.out.println(cities);

        shoes.removeAll(cities);
        System.out.println(shoes);

        shoes.remove(1);
        System.out.println(shoes);

        shoes.addAll(0,cities);
        System.out.println(shoes);



        ArrayList<String > animals= new ArrayList<>();


        animals.add("lion");
        animals.add("cat");
        animals.add("monkey");
        animals.add("dog");
        animals.add("giraffe");

        //set();
        System.out.println(animals);
        animals.set(1,"fox");
        System.out.println(animals);




    }
}
