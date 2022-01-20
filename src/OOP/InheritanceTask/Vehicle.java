package OOP.InheritanceTask;

public class Vehicle {
    /*
    ===================TASK===================
-Vehicle
  Variables:
    protected  model;
    default year;
    public brand;
  Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
  Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
     */

    protected  String model;
     int year;
    public String brand;


    // Constructor
//   public Vehicle(){
//    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    // methods();

      void drive(){
        System.out.println(" Vehicle is moving");
    }
     boolean stop(boolean isStopped){
         System.out.println(" Is vehicle stopped");

        return isStopped;
    }
    protected boolean start(boolean isStarting){
        System.out.println(" Is vehicle started");
       return isStarting;
    }

    Vehicle accelerate(){
        System.out.println(" Vehicle is accelerating >>>>>>");
        return new Vehicle(model,year,brand);
    }


}
