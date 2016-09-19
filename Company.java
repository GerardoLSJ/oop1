import java.util.*; //ArrayList

public class Company extends Employee{

  private String name;
  private ArrayList empList;
  private int numEmp;

  public Company(int size){
    this.empList = new ArrayList<Employee>();

  }

  public void addEmp(Employee employee){
    this.empList.add(employee);
    //System.out.println(this.empList.toString());

  }
  public ArrayList<Employee> getEmpList(){
    return this.empList;
  }

  public void display(ArrayList<Employee> arr){
    System.out.println("Employees: ");
    System.out.println(arr.toString());
  }



  public void removEmp(ArrayList<Employee> arr, int toRemove){
    int idx = 0;

    for (Employee item:arr){
        if(item.getID() == toRemove){
          System.out.println( "Removiendo, indice:" + idx);
          System.out.println( item.toString() );
          System.out.println( "********** ");
          this.empList.remove(item);
          //System.out.println( "item: "+ item.getID() +" toRemove: " + toRemove );
        }
       //System.out.println( item.getID() );
       idx ++;
    }

  }

  public int searchById(ArrayList<Employee> arr, int index){
    int idx = 0;

    for (Employee item:arr){
        if(item.getID() == index){
            System.out.println( "index: "+ idx );
            return idx;
         }
       else {
         idx ++;
         }
    }
    System.out.println( "No existe: -1");
    return -1;
  }

    public ArrayList<Employee> searchByGender(ArrayList<Employee> arr, char gender){
    int idx = 0;
    ArrayList<Employee> genderArr = new ArrayList<Employee>();
    for (Employee item:arr){
        if(item.getGender() == gender){
            genderArr.add(item);
         }
       else {
         idx ++;
         }
    }
    System.out.println("genderArr: ");
    System.out.println(genderArr);
    return genderArr;
  }




  public static void main(String[] args) {
    Company ibm = new Company(10);

    System.out.println("Company");
    Employee e1 = new Employee(1, "luis",  9999,'H');
    Employee e2 = new Employee(42,"Jorge2", 2999,'H');
    Employee e3 = new Employee(45,"sonia", 32322,'M');
    //e1.toString();

    ibm.addEmp(e1);
    ibm.addEmp(e2);
    ibm.addEmp(e3);

    ibm.removEmp(ibm.getEmpList(),42);
    ibm.searchById(ibm.getEmpList(),44);
    ibm.display(ibm.getEmpList());
    ibm.searchByGender(ibm.getEmpList(),'M');
  }
}
