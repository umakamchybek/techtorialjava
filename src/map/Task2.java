package map;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String string = "Ping Pong";
        string=string.replace(" ","");

        HashMap <Character, Integer> map = new HashMap<>();

        for( int i=0; i< string.length(); i++){

            if(!map.containsKey(string.charAt(i))){
               map.put(string.charAt(i),1);
            }else{
                map.put(string.charAt(i),map.get(string.charAt(i))+1);
            }

        }System.out.println(map);



    }
}
