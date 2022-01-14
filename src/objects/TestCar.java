package objects;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("toyota");
        Car car2 = new Car("honda");
        Car car3 = new Car("supra");

        car1.move();
        car2.move("west");
        System.out.println(car1);
        System.out.println(car2);
        car1=null;
        System.gc();





        }
    }

