package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        //store 5 computer object into an Arraylist


        Computer computer1 = new Computer("Mac",1100,16,
                "Silver",256);

        Computer computer2 = new Computer("Hp",1100,16,
                "Silver",256);

        Computer computer3 = new Computer("Dell",1100,16,
                "Silver",256);
        Computer computer4 = new Computer("Lenovo",1100,16,
                "Silver",256);
        Computer computer5 = new Computer("Mac",1100,16,
                "Silver",256);

        ArrayList<Computer> list = new ArrayList<>();

        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);

        //System.out.println(list);

        for(Computer device: list){
            if(device.brand.equalsIgnoreCase("Mac")){
                System.out.println(device);
                System.out.println(device.brand);
                System.out.println(device.price);
            }
        }





    }
}
