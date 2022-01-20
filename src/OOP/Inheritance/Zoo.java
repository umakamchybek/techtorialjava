package OOP.Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Leo";
        animal.eat();

        DomesticAnimal domesticAnimal = new DomesticAnimal();

        domesticAnimal.eat();

        Cat cat = new Cat();
        cat.eat();
        WildAnimals wildAnimal = new WildAnimals();
        System.out.println(wildAnimal.name);
        wildAnimal.hunting();
        wildAnimal.run();
        wildAnimal.name = "Simba";
        wildAnimal.run();

        Lion lion = new Lion();
        lion.run();




    }
}
