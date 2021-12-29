package objects;

import java.util.Scanner;

public class TestAnimal {



    public static void main(String[] args) {


        Animal cat = new Animal();
        System.out.println(cat.name);

        cat.name = "Leo";

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);

        cat.age=9;
        cat.color="orange";

        System.out.println(cat.color);
        System.out.println(cat.age);

        // create a dog  animal, try to use instance variables with your new object


         Animal dog = new Animal();

         dog.name = "simba";
         dog.age = 3;
         dog.color= "brown";
         dog.breed="boxer";

        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.name);
        System.out.println(dog.breed);
        cat.breed= "scottish";
        System.out.println(cat.breed);


        cat.sleep();
        dog.sleep();

        cat.eat();
        dog.eat();


        dog.run();
        System.out.println(dog.energy);
        System.out.println(cat.energy);
        dog.run();
        dog.run();
        dog.sleep();
        System.out.println(dog.energy);
        System.out.println(cat);









    }
}
