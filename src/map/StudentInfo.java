package map;

public class StudentInfo {
    /*
    StudentInfo
-------------
FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago

FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: HighPark

FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka

FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
Collapse
     */
    String firstname;
    String lastName;
    int age;
    String gender;
    String city;

    public StudentInfo(String firstname, String lastName, int age, String gender, String city) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

}
