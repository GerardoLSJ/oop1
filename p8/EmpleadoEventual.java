public class EmpleadoEventual implements Nomina
{
 String nombre = null;
 String titulo = "Empleado Eventual";
 public EmpleadoEventual(String nom)
 {
 nombre = nom;
 }
 public void metodo()
 {
 System.out.println("En EmpleadoEventual");
 System.out.println("Mi nombre es " + this.nombre + ", soy " + this.titulo + " de la empresa " + EMPRESA + " y no tengo sueldo fijo\n");
 }
 public void detalleDeEmpleado()
 {
 this.metodo();
 }
}
