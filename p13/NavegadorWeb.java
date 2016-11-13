import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
public class NavegadorWeb
{
public static void main(String[] args) throws Exception
{
new NavegadorWeb( "Aqui pega un codigo HTML" );
}

public NavegadorWeb()
{
}
public NavegadorWeb( String htmlString )
{
// Crea el JEditorPane que estara contenido en el JFrame
JEditorPane jEditorPane = new JEditorPane();
// Lo hacemos de solo lectura
jEditorPane.setEditable(false);
// Creamos un ScrollPane y le asociamos el JEditorPane
JScrollPane scrollPane = new JScrollPane(jEditorPane);
// Creamos un HTMLEditorKit
HTMLEditorKit kit = new HTMLEditorKit();
// y lo asociamos al JEditorPane
jEditorPane.setEditorKit(kit);
// Creamos un Document, lo seteamos o ligamos al JEditorPane
// y despues al mismo JEditorPane le asociamos el texto html que mostrara
// y que viene como parametro del constructor
Document doc = kit.createDefaultDocument();
jEditorPane.setDocument(doc);
jEditorPane.setText(htmlString);
// Ahora agregamos el ScrollPane al JFrame
JFrame j = new JFrame("Programacion Orientada a Objetos");
j.getContentPane().add(scrollPane, BorderLayout.CENTER);
// Le especificamos que al dar click en la X se cierre y termine la aplicacion
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// definimos el tamano del frame, ancho y alto en pixeles
j.setSize(new Dimension(600,500));
// centramos el frame y lo hacemos visible
j.setLocationRelativeTo(null);
j.setVisible(true);
}
}