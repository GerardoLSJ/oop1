import java.io.*;
public class LeeDeArchivoLinea
{
public static void main( String args[] ) throws Exception
{
String linea = "";
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
"archivo.txt" )));
while( (linea = br.readLine()) != null )
{
System.out.println( "linea=" + linea );
}
br.close();
}
}