package objects;

public class Cat {

    String name;
    int age;
    String color;
    int foodAmount;


    //create a method named as run(), it will take the parameter as destination
    //it will reduce food amount by 1 for every execution
    //it will print out as " Cat is running ...<west>"

    public void run(String destination){
        foodAmount-=1;
        System.out.println(name+ " is running to "+ destination);

    }
    //=============================================

    public void run(){

        System.out.println("Overloaded run method in the Cat class ");
    }
    //create a method name as setColor(), it will take a parameter
    //and initialize the color of the cat

    //============================================
    public void setColor(String newColor){
        color=newColor;

        System.out.println( name+ " 's color is "+ color);
    }
    //===========================================================

    public String getColor(){

        return color;
    }

    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.name="Ginger";
        cat1.color="Orange";
        cat1.age=5;
        cat1.foodAmount=10;

        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.setColor("white");
        System.out.println(cat1.color);

        System.out.println(" this is coming from getColor() " + cat1.getColor());

    }
}
