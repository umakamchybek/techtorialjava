package OOP.Inheritance;

import OOP.Inheritance.WildAnimals;

public class Lion extends WildAnimals{


    @Override
    public WildAnimals run() {
        return new Lion();
    }
}