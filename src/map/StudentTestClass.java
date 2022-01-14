package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentTestClass {
    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();

        student1.put("FirstName","David");
        student1.put("LastName","Pena");
        student1.put("Age","25");
        student1.put("Gender","M");
        student1.put("City","Chicago");

        HashMap<String, String> student2 = new HashMap<>();

        student2.put("FirstName","Jeremiah");
        student2.put("LastName","Johnson");
        student2.put("Age","15");
        student2.put("Gender","M");
        student2.put("City","New York");

        HashMap<String, String> student3 = new HashMap<>();

        student3.put("FirstName","John");
        student3.put("LastName","Smrha");
        student3.put("Age","40");
        student3.put("Gender","M");
        student3.put("City","Boston");

        HashMap<String, String> student4 = new HashMap<>();

        student4.put("FirstName","Alex");
        student4.put("LastName","Born");
        student4.put("Age","35");
        student4.put("Gender","F");
        student4.put("City","Chicago");

        List<HashMap <String,String> >studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);

        // find all students who are living in Chicago and show their name

        for( HashMap <String, String> studentInfoMap : studentList ){
             if(studentInfoMap.get("City").equals("Chicago")){
                System.out.println(studentInfoMap.get("FirstName")+ " is living in Chicago");

             }
        }
        printStudentInfo(studentList);


    }
   // method
    public static void printStudentInfo(List <HashMap <String, String> >list){
        for( HashMap <String, String> studentInfoMap : list ){
            if(studentInfoMap.get("City").equals("Chicago")){
                System.out.println(studentInfoMap.get("FirstName")+ " is living in Chicago");
            }
        }
    }
}
