import java.util.*; //ArrayList

public class Company extends Employee{

  private String name;
  private ArrayList<Employee> empList;
  private int numEmp;
  public ArrayList<Employee> lista2;


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



  public void removEmp(ArrayList<Employee> arr ){

    Scanner read=new Scanner(System.in);
    System.out.println("ID a eliminar:  ");
    int toRemove = read.nextInt();
  


for(int i=0; i<(lista2).size(); i++)
  {
   if( (lista2).get(i).getID() == toRemove )
   {
    (lista2).remove( lista2.get(i) );
   }
   else{
    System.out.println("No se encuentra el ID, empleado NO eliminado");
  }
  }


  }




  public int searchById(ArrayList<Employee> arr){
    int idx = 0;

    Scanner read2= new Scanner(System.in);
    System.out.println("ID a buscar:  ");
    int index = read2.nextInt();



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

    public ArrayList<Employee> searchByGender(ArrayList<Employee> arr){
    int idx = 0;

    Scanner read3= new Scanner(System.in);
    System.out.println("Genero a mostrar (F)(M):  ");
    char gender  =  read3.next().charAt(0);

    
    ArrayList<Employee> genderArr = new ArrayList<Employee>();
    for (Employee item:arr){
        if(item.getGender() == gender){
            genderArr.add(item);
         }
       else {
         idx ++;
         }
    }
    System.out.println("Lista de empleados" + gender + " : ");
    System.out.println(genderArr);
    return genderArr;
  }


  public void getData(int howMany) {

    String Nametemp;
    int IDtemp;
    double Salariotemp;
    char Gendertemp;
 
    this.lista2 = new ArrayList<Employee>();

//Creando lista de empleados 
  System.out.println("Creando lista de empleados\n---------");
  System.out.println("Ingrese los datos de los empleados: \n ");
 for (int i=0; i< howMany ;i++)
        {

        Scanner read=new Scanner(System.in); //Previene el doble salto// 
        System.out.println("\nDatos del empleado " + (i+1) +"\n\n");
        System.out.println("Nombre: ");
        Nametemp=read.nextLine();
        System.out.println("ID :  ");
        IDtemp=read.nextInt();
        System.out.println("Salario : ");
        Salariotemp=read.nextDouble();
        System.out.println("Genero  (M)(F): ");
        Gendertemp=(char) read.next().charAt(0);

        //public Employee(int id, String name, double salary, char gender){
        Employee sujetoN = new Employee(IDtemp,Nametemp,Salariotemp,Gendertemp);

        lista2.add(sujetoN);

        }

  
}




  public static void main(String[] args) {
  Scanner read4= new Scanner(System.in);
  Scanner howManyEmp= new Scanner(System.in);
    int des=0;
    int howMany;
    Company ibm = new Company(10);

    System.out.println("Cuantos empleados quiere ingresar? ");
    howMany = howManyEmp.nextInt();

    ibm.getData(howMany);

    ibm.empList = ibm.lista2;

    do{
    System.out.println("Ingrese la operacion a realizar : ");
    System.out.println("1)Mostrar Lista de empleados\n2)Mostrar Empleados por Genero\n3)Eliminar un empleado por su ID\n4)Salir\n\n");
    des=read4.nextInt();

    switch(des){

    case 1 :
    ibm.display(ibm.empList);
    break;

    case 2 :
    ibm.searchByGender(ibm.empList);
    break;

    case 3:
    ibm.removEmp(ibm.empList);
    System.out.println("Nueva lista de empleados");
    ibm.display(ibm.empList);
    break;

    case 4:
    break;

    }

  }while(des<4);

 /*   ibm.display(ibm.empList);
    ibm.searchByGender(ibm.empList);
    ibm.searchById(ibm.empList);
    //ibm.display(ibm.empList);
    ibm.removEmp(ibm.empList);
    ibm.display(ibm.lista2); */

  }
}
