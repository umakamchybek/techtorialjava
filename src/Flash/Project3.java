package Flash;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your music type from below: Classic, Pop, Country" );
        String musicType=input.nextLine().toLowerCase();

        if(musicType.equals("classic")) {
            int priceOfClassic= 2;
            System.out.println("Please select the songs from bellow: 1-Four Seasons, 2-Fur Elise, " +
                    "3-Finlandia, 4-Vocalise, 5-The Planets");
            String classicSong = input.nextLine().toLowerCase().trim();

            if (classicSong.equals("four seasons")) {
                System.out.println("");



            } else if (classicSong.equals("fur elise")) {


            } else if (classicSong.equals("finlandia")) {


            } else if (classicSong.equals("vocalise")) {


            } else if (classicSong.equals("the planets")) {


            }else if(musicType.equals("Pop")){

            }else{
                System.out.println("Name of the song is not available");
            }

        }else {
            System.out.println("Your music type doesn't work!!!");
        }



    }
}
