package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet <Integer> ids = new HashSet();
        HashSet <Integer>ids1 = new HashSet<>();
        Set<Integer> ids2= new HashSet();

        ids.add(22);
        ids.add(33);
        ids.add(44);
        ids.add(99);

        System.out.println(ids);
        System.out.println(ids.equals("22"));
        System.out.println(ids.contains(22));
        System.out.println(ids.hashCode());

        ids.add(null);
        System.out.println(ids);
        ids.add(null);// you can't store duplicates

        for(Integer id:ids){
            if(id==null){
                continue;
            }
            System.out.println(id*2 );

        }
        Iterator iterator=ids.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(ids.size());

    }
}
