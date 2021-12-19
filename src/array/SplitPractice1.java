package array;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str = "stay safe and Healthy";
       String[] words= str.split(" ");

        System.out.println(str);
        System.out.println(Arrays.toString(words));

        //print out every single word as: ....***
        for(String word:words){

            System.out.println(word+"****");
           // System.out.println(word.concat("***"));
        }


        String[] words2 =str.split("a",4);
        System.out.println(Arrays.toString(words2));

        System.out.println(words2.length);


        //12/17/2021
        //12.17.2021
        //12-17-2021
        //_

        String dates= "12_17_2021";
        String []splitDate=dates.split("_");
        System.out.println(Arrays.toString(splitDate));

        dates="12.17.2021";
        String []splitDate2=dates.split("\\.");
        System.out.println(Arrays.toString(splitDate2));


            System.out.println("\"something\"");

        for(String d:splitDate2){
            System.out.println("\""+d+"\"");
        }






    }
}
