public class Empleado implements Nomina
{
 String nombre = null;
 float salario = 0.0f;
 String titulo = "Empleado";
 public Empleado(String nom, float sal)
 {
 nombre = nom;
 salario = sal;
 }
 public void metodo()
 {
 System.out.println("En Empleado");
 System.out.println("Mi nombre es " + this.nombre + ", soy " + this.titulo + " de la empresa " + EMPRESA + " y gano: $" + this.salario + "\n");
 }
 public void detalleDeEmpleado()
 {
 this.metodo();
 }
}
