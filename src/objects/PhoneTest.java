package objects;

public class PhoneTest {
    public static void main(String[] args) {

//
//        Phone phone = new Phone();// not default constructor already
//        System.out.println("************"+phone.color);
////
////        phone.brand= "Iphone";
////        phone.call(911);
////
//        Phone phone1= new Phone();
//
//        Phone phone2 = new Phone("Pink");
//        System.out.println(phone2.color);
//        System.out.println(phone1.color);
//
//        Phone phone3 = new Phone("black","Samsung");





        Employee empl1 = new Employee();
        System.out.println(empl1.name);

        Employee empl2= new Employee(123);
        System.out.println(empl2.id);


        Employee empl3 = new Employee("David","FaceBook");

        System.out.println(empl3.name);
        System.out.println(empl3.companyName);


        Employee empl4= new Employee(50000);
        System.out.println(empl4.budget);






    }




}
