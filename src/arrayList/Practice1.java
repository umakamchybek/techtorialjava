package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1= new ArrayList();
        ArrayList list2= new ArrayList(10);

        ArrayList <String> list3 =new ArrayList();

       list1.add("Rose");
       list1.add(21);
       list1.add('t');
       list1.add(4.5);


        System.out.println(list1);
        list1.add(1,"Tulip");
        System.out.println(list1);


        for(int i = 0; i <list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println(list1.get(3));
        System.out.println("*******************");

        //use for each loop to print
        for( Object o:list1){
            System.out.println(o);
        }
        System.out.println("***********");


// add(), size(), get()
        list1.add(5,"violet");
        System.out.println(list1);

        System.out.println("=======================");

        list3.add("1234");
        list3.add("Test");
        //list3.add(34);
        System.out.println(list3);



    }
}
