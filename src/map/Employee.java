package map;

public class Employee {
    /*
    ====TASK:===========
-create an employee class with instance variables of name, city, age, id
-create one constructor to intialize instance variables
-create a method to generate random  employee id and use this id for emplyee
-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids
-create a method to print only employee names from map

     */

    String name;
    String city;
    int age;
    int id;

    public Employee(String name, String city, int age, int id) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
