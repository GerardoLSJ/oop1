import java.io.*; 
import java.util.*;
//For Hash function
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener
{
  private JTextField tfLogin;
  private JPasswordField tfPassword;
  private JButton btnAceptar;
  private JButton btnCancelar;
  public Map map = new HashMap();

  /**
   * Launch the application.
    */
  public static void main(String[] args)
  {
    Login frame = new Login();
    frame.load();
  }

  /**
   * Create the frame.
   */
  public Login()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 335, 161);
    setLayout(new GridLayout(3, 2));

    JLabel lblNewLabel = new JLabel("Login:");
    add(lblNewLabel);
	
    tfLogin = new JTextField();
    tfLogin.setColumns(10);
    add(tfLogin);

    JLabel lblLogin = new JLabel("Password:");
    add(lblLogin);

    tfPassword = new JPasswordField();
    tfPassword.setColumns(10);
    add(tfPassword);

    btnAceptar = new JButton("Aceptar");
    btnAceptar.addActionListener( this );
    add(btnAceptar);

    btnCancelar = new JButton("Cancelar");
    btnCancelar.addActionListener( this );
    add(btnCancelar);

    this.setVisible(true);
  }

  
    public void load(){
        try {
        String linea = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("archivo.txt" )));
        while( (linea = br.readLine()) != null )
        {
            if(linea.length() > 0){
                    String[] line = linea.split(",");
                    map.put(line[0],line[1]);
            }else{

            }
        }
        
        br.close();
        
            } catch(IOException e){
                //System.out.println(e);

        }

    }

  public void actionPerformed( ActionEvent event )
  {
    Object o = event.getSource();
    JButton b = null;
    if( o instanceof JButton )
      b = (JButton)o;
    if( b == btnAceptar )
    {
      String user = tfLogin.getText();
      char[] passArr = tfPassword.getPassword();
      String pass="";

      for( int i=0; i<passArr.length; i++ )
      {
        pass = pass + passArr[i];
      }

      System.out.println( "user: " + user + " pass: "+ pass + "Expected: " + map.get(user));
      // Aqui va el codigo de validacion de datos contra el archivo
     int intPass = 0;
      if(map.get(user) != null){
           intPass = Integer.valueOf((String) map.get(user));
      }else{
           intPass = 0;
      }

      if(intPass != 0 && (pass.hashCode() == intPass)){
          JOptionPane.showMessageDialog(this,"Datos correctos");

      }else if(intPass != 0){
          JOptionPane.showMessageDialog(this,"Usuario correcto, contraseña erronea");
      }
      else{
           JOptionPane.showMessageDialog(this,"Usuario no encontrado");
      }
      
    }
    else if( b == btnCancelar )
    {
      tfLogin.setText("");
      tfPassword.setText("");
    }
  }
}