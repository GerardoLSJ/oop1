import java.io.*;
public class LeeDeArchivo
{
 public static void main (String[] args)
 {
 try
 {
 FileInputStream fis = new FileInputStream("prueba.txt");
 int i = 0;
 while ( (i = fis.read()) != -1 )
 {
 System.out.println( i );
 }
 fis.close();
 }
 catch(IOException e)
 {
 System.out.println("java.io.IOException generada");
 e.printStackTrace();
 }
 }
} 