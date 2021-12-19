package Flash;

import java.util.Locale;
import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {

        Scanner myScanner=new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop, and Country\nPlease enter the music type:");
        String musicType = myScanner.nextLine().toLowerCase(Locale.ROOT);
        while (!(musicType.equals("classical") || musicType.equals("pop") || musicType.equals("country"))) {
            System.out.println("TYPE OF MUSIC is not available");
            System.out.println("Available music types are Classical, Pop, and Country\nPlease enter the music type from the list:");
            musicType = myScanner.nextLine().toLowerCase(Locale.ROOT);
        }
        switch (musicType) {
            case "classical":
                System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets\nWhich one do you want to listen?");
                String song = myScanner.nextLine();
                while (!(song.equalsIgnoreCase("four seasons") || song.equalsIgnoreCase("fur elise") || song.equalsIgnoreCase("finlandia") || song.equalsIgnoreCase("vocalise") || song.equalsIgnoreCase("the planets"))) {
                    System.out.println("Name Of Song \"" + song + "\" is not available");
                    System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets \nWhich one do you want to listen?");
                    song = myScanner.nextLine();
                }
                if (song.equalsIgnoreCase("four seasons") || song.equalsIgnoreCase("fur elise") || song.equalsIgnoreCase("finlandia") || song.equalsIgnoreCase("vocalise") || song.equalsIgnoreCase("the planets")) {
                    System.out.println("Please enter the 2$ for this song");
                    double price = myScanner.nextDouble();
                    if (price == 2) {
                        System.out.println(song.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song!");
                    } else if (price < 2) {
                        System.out.println(2 - price + "$ is not enough. Please try later.");
                    } else if (price > 2) {
                        System.out.println("You have entered " + (price - 2) + "$ dollar more. Please wait for the change. " + song.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song.");
                    } else {
                        System.out.println("This input is not correct");
                    }
                }
                break;
            case "pop":
                System.out.println("Bad guy, Talk, Please Me, 7 Ring, Without Me\nis available songs under Pop music\nWhich one do you want to listen?");
                String song1 = myScanner.nextLine();
                while (!(song1.equalsIgnoreCase("bad guy") || song1.equalsIgnoreCase("talk") || song1.equalsIgnoreCase("please Me") || song1.equalsIgnoreCase("7 Ring") || song1.equalsIgnoreCase("Without Me"))) {
                    System.out.println("Name Of Song \"" + song1 + "\" is not available");
                    System.out.println("Bad guy, Talk, Please Me, 7 Ring, Without Me\nis available songs under Pop music\nWhich one do you want to listen?");
                    song1 = myScanner.nextLine();
                }
                if (song1.equalsIgnoreCase("bad guy") || song1.equalsIgnoreCase("talk") || song1.equalsIgnoreCase("please Me") || song1.equalsIgnoreCase("7 Ring") || song1.equalsIgnoreCase("Without Me")) {
                    System.out.println("Please enter the 4$ for this song");
                    double price = myScanner.nextDouble();
                    if (price == 4) {
                        System.out.println(song1.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song!");
                    } else if (price < 4) {
                        System.out.println(4 - price + "$ is not enough. Please try later.");
                    } else if (price > 4) {
                        System.out.println("You have entered " + (price - 4) + "$ dollar more. Please wait for the change. " + song1.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song.");
                    } else {
                        System.out.println("This input is not correct");
                    }
                }
                break;
            case "country":
                System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along\nis available songs under Country music\nWhich one do you want to listen?");
                String song2 = myScanner.nextLine();
                while (!(song2.equalsIgnoreCase("meant to be") || song2.equalsIgnoreCase("heaven") || song2.equalsIgnoreCase("simple") || song2.equalsIgnoreCase("one number away") || song2.equalsIgnoreCase("get along"))) {
                    System.out.println("Name Of Song \"" + song2 + "\" is not available");
                    System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along\nis available songs under Country music\nWhich one do you want to listen?");
                    song2 = myScanner.nextLine();
                }
                if (song2.equalsIgnoreCase("meant to be") || song2.equalsIgnoreCase("heaven") || song2.equalsIgnoreCase("simple") || song2.equalsIgnoreCase("one number away") || song2.equalsIgnoreCase("get along")) {
                    System.out.println("Please enter the 3$ for this song");
                    double price = myScanner.nextDouble();
                    if (price == 3) {
                        System.out.println(song2.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song!");
                    } else if (price < 3) {
                        System.out.println(3 - price + "$ is not enough. Please try later.");
                    } else if (price > 3) {
                        System.out.println("You have entered " + (price - 3) + "$ dollar more. Please wait for the change. " + song2.toUpperCase(Locale.ROOT) + " is playing. Enjoy the song.");
                    } else {
                        System.out.println("This input is not correct");
                    }
                }
                break;
            default:
                System.out.println("TYPE OF MUSIC is not available");
                break;



        }


    }
}
