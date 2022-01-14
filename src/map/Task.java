package map;

import java.util.HashMap;

public class Task {
    public static void main(String[] args) {


        String[] drinks = {"coke", "water", "coke", "coffee", "ayran", "water","ayran","ayran","ayran"};
        //store these drinks into a map with the amount that how many times you see them in the array
        HashMap<String, Integer> map = new HashMap<>();

        for (String drink : drinks) {
            if (!map.containsKey(drink)) {
                map.put(drink, 1);

            } else {
                map.put(drink, map.get(drink) + 1);
            }


        }
        System.out.println(map);

    }
}

