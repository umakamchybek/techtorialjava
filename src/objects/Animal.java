package objects;

public class Animal {

       // instance variables
       String name;
       int age;
       String color;
       String breed= "Boxer";
       int energy = 100;




       public void sleep(){

              energy = 100;
              System.out.println(name + " is sleeping");
              System.out.println(name + " is charging up");
              System.out.println("Now "+ name+ "'s  energy is "+ energy + "%");

       }

       public void eat(){

              System.out.println(name + " is eating");
       }

       public void run(){

              energy= energy-10;
              System.out.println(name + " has "+ energy+ "% of energy");


       }

       public void info(){
              System.out.println("Name is: "+name + "  Age is: "+age+
                      " The color is: "+ color+" Breed is: "+breed+ " Energy is: " + energy);
       }






}
