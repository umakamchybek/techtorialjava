package objects;

public class Car {


    String brand;

    public Car(String newBrand){
        this.brand=newBrand;
    }

    public void move(){

        System.out.println("car is moving");
    }

    public boolean move(String dest){
        System.out.println(brand+ " moving to "+dest);
        return true;
    }

    @Override
    public String toString() {
        return "my car's brand is "+brand;
    }
    protected void finalize(){
        System.out.println(" finalize");
    }
}
