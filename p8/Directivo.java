public class Directivo extends Empleado
{
 String titulo = "Directivo";
 public Directivo(String nom, float sal)
 {
 super(nom, sal);
 }
 public void metodo()
 {
 System.out.println("En Directivo");
 System.out.println("Mi nombre es " + this.nombre + ", soy " + this.titulo + " de la empresa " + EMPRESA + " y gano: $" + this.salario + "\n");
 }
}
