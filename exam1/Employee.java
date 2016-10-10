import java.util.*; //ArrayList

public class Employee {

  private String  name;
  private int     id;
  private double  salary;
  private char    gender;

  public Employee(){ /*Default constructor */ }
  public Employee(int id, String name, double salary, char gender){
        this.id     = id;
        this.name   = name;
        this.salary = salary;
        this.gender = gender;
  }
  public Employee(Employee employee){
        this.id     = employee.id;
        this.name   = employee.name;
        this.salary = employee.salary;
        this.gender = employee.gender;

  }

  public String toString(){
    System.out.println(this.id + " " + this.name + " " + this.salary + " " + this.gender);
    return new String();
  }

public int getID(){
  return this.id;
}
public char getGender(){
  return this.gender;
}
  public static void main(String[] args) {


  }
}
