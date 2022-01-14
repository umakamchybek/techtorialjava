package objects;

public class Employee {
    /*  Task
    create Employee_Class:
    `method: to update company budget
    `instance fields: --> id, name, budgetOfCompany, companyName
    `constractors: --> no args, one arg, multiple
     */
    int id;
    String name="Uma";
    double budget=300000;
    String companyName="Google";

    public Employee(){
        System.out.println("No arguments");

    }
    public Employee(int newId){
        this.id=newId;
        System.out.println("With one args");
    }
    public Employee(String newName, String newCompName){

        this.name=newName;
        this.companyName=newCompName;
        System.out.println(" This is with multiple args");
    }

    public void updatedBudget(double newBudget){
        budget+=newBudget;
        System.out.println(" This is thee new budget" + newBudget);
    }


}
