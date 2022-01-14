package arrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {

        Flower fl1= new Flower("red","rose",20);
        Flower fl2= new Flower("yellow","tulip",15);
        Flower fl3= new Flower("white","rose",20);
        Flower fl4= new Flower("pink","lilly",10);


        ArrayList<Flower> list = new ArrayList<>();

        list.add(fl1);
        list.add(fl2);
        list.add(fl3);
        list.add(fl4);


        System.out.println(fl1.price);
        System.out.println(fl2.price);
        System.out.println(fl3.price);
        System.out.println(fl4.price);
        for(Flower flowers: list){
            System.out.println(flowers.name + " is $ "+flowers.price);
        }

      double flowercost=Flower.totalPrice(list);
        System.out.println(flowercost);
    }
}
