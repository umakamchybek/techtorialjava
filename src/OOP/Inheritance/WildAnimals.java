package OOP.Inheritance;

public class WildAnimals extends Animal{

    String name;

    public void hunting(){

        System.out.println("Wild animal is hunting");

    }

    @Override
    public WildAnimals run() {

        System.out.println(name+" is running");
        return new WildAnimals();
    }
}