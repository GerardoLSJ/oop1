import java.io.*;
public class EscribeAArchivoLinea
{
public static void main( String args[] ) throws Exception
{
PrintWriter pw = new PrintWriter( new OutputStreamWriter( new FileOutputStream(
"archivo.txt" ) ) );
pw.println( "Escribiendo linea 1 de texto" );
pw.println( "Escribiendo linea 2 de texto" );
pw.println( "Escribiendo linea 3 de texto" );
pw.println( "Escribiendo linea 4 de texto" );
pw.close();
}
}