package arrayList;

import java.util.ArrayList;

public class Flower {
    String color;
    String name;
    double price;

    public Flower(String color, String name, double price) {

        this.color = color;
        this.name = name;
        this.price = price;
    }
    public static double totalPrice(ArrayList<Flower> list) {
        double sum = 0;
        for (Flower flowers : list) {
            sum += flowers.price;
        }
        return sum;
    }

}











