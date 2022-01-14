package MentoringWithAhmet;

import arrayList.ArraylistToArray;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.*;

public class PracticeArrayArraylistMap {
    public static void main(String[] args) {

        PracticeArrayArraylistMap object = new PracticeArrayArraylistMap();
//        object.PrintDairy();
//        object.PrintChips();
//        object.PrintCookies();
//
//        object.PrintDairyNameAndPrice();
        object.PrintAll();



    }

        //LETS DO IT STEP BY STEP:

        //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
        String[] dairy = {"Milk","Cheese", "Butter", "Yogurt", "Cream", "Casein" };

        //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
        String[] chips = {"Lays", "Fritos", "Cheetos","Doritos", "Ruffles", "Pringles"};

        //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand

        String[] cookies = {"Nabisco","Oreo", "Nestle", "Amos", "SnackWell", "MaryLand" };


        //TASK 1:
        //  Create three more arrays to store the prices for these products.
        //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
        double[] dairyPrice = { 2.99, 1.99, 3.99, 2.49, 0.99, 1.69 };

        //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
        double[] chipsPrice = { 3.99,  2.99,  4.99,  3.49,  1.99,  2.69};

        //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
        double[] cookiesPrice = {4.99,  3.99,  5.99,  4.49,  2.99,  3.69};

        //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
       public void PrintDairy(){
           List <String> dairyList = new ArrayList<>();
           for( String product: dairy){
               dairyList.add(product);
           }
           System.out.println(dairyList);
       }
      //******** list<String> shortway = new ArraylistToArray<>(Arrays.asList(dairy));// second version, but we shouldn't use
                // System.out.println(shortway);


//    Create the method to print the Chips.(do it with the list, think about the reason why )
public void PrintChips(){
    List <String> chipsList = new ArrayList<>();
    for( String product: chips){
        chipsList.add(product);
    }
    System.out.println(chipsList);
}




//    Create the method to print the Cookies (do it with the list, think about the reason why )

    public void PrintCookies(){
        List <String> cookiesList = new ArrayList<>();
        for( String product: cookies){
            cookiesList.add(product);
        }
        System.out.println(cookiesList);
    }
        //TASK 3:
        //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )


//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )


//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )


        //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
    public void PrintDairyNameAndPrice(){
        Map<String, Double> listOfTheDairyPrice = new LinkedHashMap<>();
        for( int i = 0; i< dairy.length; i++){
            listOfTheDairyPrice.put(dairy[i], dairyPrice[i]);
        }
        System.out.println(listOfTheDairyPrice);
    }


//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )
    public void PrintChipsNameAndPrice() {
        Map<String, Double> listOfTheChipsPrice = new LinkedHashMap<>();
        for (int i = 0; i < dairy.length; i++) {
            listOfTheChipsPrice.put(dairy[i], dairyPrice[i]);
        }
        System.out.println(listOfTheChipsPrice);
    }




//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
        public void PrintCookiesNameAndPrice(){
            Map<String, Double> listOfTheCookiesPrice = new LinkedHashMap<>();
            for (int i = 0; i < dairy.length; i++) {
                listOfTheCookiesPrice.put(dairy[i], dairyPrice[i]);
            }
            System.out.println(listOfTheCookiesPrice);
        }

        //TASK 5:
        // Do all Task4 in a same method
    public void PrintAll(){
        Map<String, Double> listOfTheDairyPrice = new LinkedHashMap<>();
        Map<String, Double> listOfTheChipsPrice = new LinkedHashMap<>();
        Map<String, Double> listOfTheCookiesPrice = new LinkedHashMap<>();
        for (int i = 0; i < dairy.length; i++) {
            listOfTheDairyPrice.put(dairy[i], dairyPrice[i]);
            listOfTheChipsPrice.put(chips[i], chipsPrice[i]);
            listOfTheCookiesPrice.put(cookies[i], cookiesPrice[i]);
        }
        System.out.println(listOfTheDairyPrice);
        System.out.println(listOfTheChipsPrice);
        System.out.println(listOfTheCookiesPrice);

    }


        //TASK 6:

        //Create a method with the parameter String nameofItem and find the price of the product ?



        //Create a method with the parameter String nameofItem and remove it from the map



        //Create a method with the parameter String nameofItem and replace it with the new product













}
