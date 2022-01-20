package OOP.FinalPractice;

public class Shirt {
   final String COLOR="White";// with the uppercase
    double price;
    char size;
    String material;

    public Shirt(String color, double price, char size, String material) {
       // this.color = color;// it will not compile, since COLOR final
        this.price = price;
        this.size = size;
        this.material = material;
    }
    public void setCOLOR(String color){
        //this.COLOR= color;  //  it will not compile, since COLOR final

    }

    public Shirt(){
        System.out.println(" this is no argument constructor");
    }

    final public void wash(){
        System.out.println(" You can wash this shirt");

    }

    public boolean fit(char size){

        if(this.size==size){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Shirt shirt= new Shirt();
        System.out.println(shirt.COLOR);
        //shirt.COLOR="Black"; it will not compile, since COLOR is final

    }





}
