public class Persons {
    String name;
    int age;
    public Persons(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Persons{
    String employeeID;
    double salary;
    public Employee(String name,int age,String employeeID,double salary){
        super(name,age);
        this.employeeID=employeeID;
        this.salary=salary;
    }
  public void display(){
        System.out.println("Name :"+name);
        System.out.println("age :"+age);
        System.out.println("Employee ID :"+employeeID);
        System.out.println("Salary :"+salary);
  }
}
