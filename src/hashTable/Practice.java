package hashTable;

import java.util.Hashtable;

public class Practice {
    public static void main(String[] args) {

        Hashtable < Integer, String> hashtable = new Hashtable<>();

        hashtable.put(4, "cherry");
        hashtable.put(5, "kiwi");
        hashtable.put(1, "aplle");

        System.out.println(hashtable);
        System.out.println(hashtable.get(2));// null
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.keySet());// returns all keys // 5,4,1
        System.out.println(hashtable.values());
        System.out.println(hashtable.entrySet());

        //null will not work

        hashtable.put(3, "Strawberry");
        System.out.println(hashtable);


    }
}
