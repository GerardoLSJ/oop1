public class ListaEmpleados
{
public static void main(String arg[])
{
 Empleado emp = new Empleado("Miguel Lopez",9500.50f);
 EmpleadoEventual empEventual = new EmpleadoEventual("Juan Alvarez");
 Gerente g = new Gerente("Jose Perez",15000,"Sistemas");
 Directivo d = new Directivo("Jorge Valdez",18000);
 emp.detalleDeEmpleado();
 empEventual.detalleDeEmpleado();
 g.detalleDeEmpleado();
 d.detalleDeEmpleado();
}
}