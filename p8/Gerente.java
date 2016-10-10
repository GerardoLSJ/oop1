public class Gerente extends Empleado
{
 String depto = null;
 String titulo = "Gerente";
 public Gerente(String nom, float sal, String dep)
 {
 super(nom, sal);
 }
 public void metodo()
 {
 System.out.println("En Gerente");
 System.out.println("Mi nombre es " + this.nombre + ", soy " + this.titulo + " de la empresa " + EMPRESA + " y gano: $" + this.salario + "\n");
 }
}
