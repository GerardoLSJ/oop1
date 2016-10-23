import java.io.*;
public class EscribeAArchivo
{
 public static void main (String[] args)
 {
 try
 {
 FileOutputStream fos = new FileOutputStream("prueba.txt");
 fos.write('t');
 fos.write('e');
 fos.write('x');
 fos.write('t');
 fos.write('o');
 fos.write(' ');
 fos.write('e');
 fos.write('s');
 fos.write('c');
 fos.write('r');
 fos.write('i');
 fos.write('t');
 fos.write('o');
 fos.write(' ');
 fos.write('d');
 fos.write('e');
 fos.write('s');
 fos.write('d');
 fos.write('e');
 fos.write(' ');
 fos.write('j');
 fos.write('a');
 fos.write('v');
 fos.write('a');
 fos.close();
 }
 catch(IOException e)
 {
 System.out.println("java.io.IOException generada");
 e.printStackTrace();
 }
 }
} 
