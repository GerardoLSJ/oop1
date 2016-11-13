import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class Registro extends HttpServlet
{
 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws IOException, ServletException
 {
String nombreUsuario = request.getParameter( "nombre" );
String carreraUsuario = request.getParameter( "carrera" );
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println( "<html>" );
 out.println( "<body bgcolor=\"white\">" );
 out.println( nombreUsuario );
out.println( carreraUsuario );
 out.println( "</body>" );
 out.println( "</html>" );
 }
}