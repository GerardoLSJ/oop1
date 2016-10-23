import java.io.*;
public class LeeDeTeclado
{
public static void main (String[] args)
{
int n = 0;
System.out.println("Escribe una letra");
try
{
n = System.in.read();
}
catch(IOException e)
{
System.out.println("java.io.IOException generada");
e.printStackTrace();
}
System.out.print("La tecla es: " + n);
}
}