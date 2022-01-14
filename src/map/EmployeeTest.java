package map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {
        HashMap <Integer,Employee> mapOfEmployees = new HashMap();

        Employee e1= new Employee("Max","New York",21,1);
        Employee e2= new Employee("David","Chicago",22,2);
        Employee e3= new Employee("John","Miami",34,9);
        Employee e4= new Employee("Alex","Boston",43,19);

        mapOfEmployees.put(e1.id,e1);
        mapOfEmployees.put(e2.id,e2);
        mapOfEmployees.put(e3.id,e3);
        mapOfEmployees.put(e4.id,e4);

        System.out.println(mapOfEmployees);
        ArrayList <String> names =new ArrayList<>();

        for(Employee employee: mapOfEmployees.values()){
            names.add(employee.name);
            System.out.println(employee.name);
            System.out.println(employee.city.toUpperCase());
        }
        System.out.println(names);



    }
}
