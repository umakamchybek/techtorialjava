package array;

public class MultidimentionPractice3 {
    public static void main(String[] args) {

        /*

        ==Task==:
BRANDS of ITEMS:
!Computers
Apple, Lenova, HP, DEll, Acer
!TVs
Samsung, LG, Sony
!Speakers
Alexa, Google, Logitec, JBL
--------------
PRICES of ITEMS:
!Computers
Apple-2500, Lenova-1600, HP-1800, DEll-1900, Acer-1100
!TVs
Samsung-2199, LG-1799, Sony-1599
!Speakers
Alexa-79.99, Google-89.99, Logitec-64.99, JBL-55.99
// STORE Brand in a multidimensional array
// STORE Prices in a multidimensional array
// print out prices for each product as:
// "price for Apple is $2500"
C
         */

        String[][] brands = {{"Apple", "Lenova", "HP", "Dell", "Acer"},{"Samsung", "LG", "Sony"},{"Alexa", "Google", "Logitec", "JBL"}};

        double[][] prices = {{2500,1600, 1800, 1900,1100}, {2199, 1799, 1599},{79.99, 89.99, 64.99, 55.99} };


        for (int i=0; i< brands.length; i++){

            for (int j=0; j< brands[i].length; j++){

                System.out.println(brands[i][j]+" is $"+prices[i][j]);
                if (prices[i][j] >1000){
                    System.out.println("This device "+brands[i][j]+" is less than $1000 >"+prices[i][j]);
                }
            }

        }


    }
}
