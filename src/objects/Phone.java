package objects;

public class Phone {

    String brand;
    double price=1000;
    String color;

    //****constructor******

    public Phone(){//if its empty its called "no argument constructor"

        this("Navy blue","Google");

        System.out.println("This is no argument constructor");
    }
    //********constuctor2

   public Phone(String newColor){
        this.color=newColor;
       System.out.println(" This is One argument constructor");

   }
   //********constructor 3
   public Phone(String newColor, String newBrand){
        this.color=newColor;
        this.brand=newBrand;
       System.out.println(" This is Two argument constructor");

   }



















    //***method1
    public void setColor(String color1){
        color=color1;
    }
    //***method2
    public void call(int number){




        System.out.println(number+ " is being called");

    }



}
