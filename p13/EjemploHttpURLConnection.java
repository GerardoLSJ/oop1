
import java.net.*;
import java.io.*;
public class EjemploHttpURLConnection extends Thread
{
public static void main(String arg[]) throws Exception
{
 for(int i=1;i<=5;i++)
 {
 EjemploHttpURLConnection ref=new EjemploHttpURLConnection();
 ref.start();
 }
}
public void run()
{
 try
 {
 URL url = new URL("http://www.fi-a.unam.mx/");
 HttpURLConnection ref = (HttpURLConnection)url.openConnection();
 System.out.println("conectando...");
 ref.connect();
 InputStream is = ref.getInputStream();
 int i=0;
 while( (i=is.read()) != -1 )
 {
 System.out.print( (char)i );
 }
 is.close();
 ref.disconnect();
 }
 catch(Exception exc)
 {
 exc.printStackTrace();
 }
}
}
