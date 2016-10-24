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

  /**
   * Launch the application.

  public static void main(String[] args)
  {
    Login frame = new Login();
  }
*/

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

  public void actionPerformed( ActionEvent event )
  {
    Object o = event.getSource();
    JButton b = null;
    if( o instanceof JButton )
      b = (JButton)o;
    if( b == btnAceptar )
    {
      String s1 = tfLogin.getText();
      char arr[] = tfPassword.getPassword();
      String s = s1 + ",";
      for( int i=0; i<arr.length; i++ )
      {
        s = s + arr[i];
      }
      System.out.println( s );
      // Aqui va el codigo de validacion de datos contra el archivo
      JOptionPane.showMessageDialog(this,"Datos correctos");
    }
    else if( b == btnCancelar )
    {
      tfLogin.setText("");
      tfPassword.setText("");
    }
  }
}