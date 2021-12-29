package objects;

public class TestStatic {
    public static void main(String[] args) {

        StaticPetPractice.eat();// you can call static methods from
        // another class by using the clss, no need to create an object
        StaticPetPractice pet = new StaticPetPractice();
        pet.eat();
        pet.play();
        System.out.println(pet.food);


    }
}
