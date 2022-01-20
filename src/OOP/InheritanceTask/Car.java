package OOP.InheritanceTask;

public class Car extends Vehicle {
    String model;
    String engineType;


    public Car()  {
        super("Camry",2022, "Toyota");
    }

    public void drive(){
        System.out.println(" Car is moving");
    }

    Car accelerate(){

        System.out.println(super.model);
        System.out.println(" Car is accelarating");
        Car car= new Car();
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car= new Car();
        Car c1 = car.accelerate();
        System.out.println(c1);
    }
}
