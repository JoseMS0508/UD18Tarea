/*@autor: Ra�l Fern�ndez*/
package pantallas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Pantalla_Registro extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuNavegacion;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JButton btnMiCuenta;
	private JButton btnSignOut;
	private JLabel lblUser;
	private JTextField txtUser;
	private JLabel lblApellido1;
	private JTextField txtApel1;
	private JLabel lblApellido2;
	private JTextField txtapel2;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNombre;
	private JLabel lblTelefono;
	private JPasswordField passwordField;
	private JLabel lblPwd;
	private JLabel lblRegistro;
	private JLabel lblFecha;
	private JLabel lblCorreo;
	private JTextField txtCorreo;
	private JButton btnRegistrarse;
	private JTextArea txtrSeAadiran;
	private JDateChooser dateChooser;

	public static void main(String[] args) {

		Pantalla_Registro frame = new Pantalla_Registro();
		frame.setVisible(true);

	}

	public Pantalla_Registro() {
		btnSignOut.setBounds(873, 53, 109, 23);
		contentPane.add(btnSignOut);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		lblUser = new JLabel("Usuario*");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUser.setBounds(207, 186, 60, 21);
		contentPane.add(lblUser);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtUser.setBounds(270, 186, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		lblApellido1 = new JLabel("Apellido 1*");
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido1.setBounds(202, 291, 65, 21);
		contentPane.add(lblApellido1);

		txtApel1 = new JTextField();
		txtApel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtApel1.setColumns(10);
		txtApel1.setBounds(270, 246, 96, 19);
		contentPane.add(txtApel1);

		lblApellido2 = new JLabel("Apellido 2");
		lblApellido2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido2.setBounds(207, 342, 60, 21);
		contentPane.add(lblApellido2);

		txtapel2 = new JTextField();
		txtapel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtapel2.setColumns(10);
		txtapel2.setBounds(270, 293, 96, 19);
		contentPane.add(txtapel2);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(270, 342, 96, 19);
		contentPane.add(textField);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 390, 96, 19);
		contentPane.add(textField_1);

		lblNombre = new JLabel("Nombre*");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(207, 244, 72, 21);
		contentPane.add(lblNombre);

		lblTelefono = new JLabel("Telefono ");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(207, 392, 60, 21);
		contentPane.add(lblTelefono);

		passwordField = new JPasswordField();
		passwordField.setBounds(270, 434, 96, 19);
		contentPane.add(passwordField);

		lblPwd = new JLabel("Contrase�a *");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPwd.setBounds(181, 432, 98, 21);
		contentPane.add(lblPwd);

		lblRegistro = new JLabel("Registro");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblRegistro.setBounds(360, 39, 229, 111);
		contentPane.add(lblRegistro);

		lblFecha = new JLabel("Fecha de Nacimiento*");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFecha.setBounds(487, 246, 132, 21);
		contentPane.add(lblFecha);

		lblCorreo = new JLabel("Correo*");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCorreo.setBounds(559, 342, 60, 21);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(642, 342, 180, 19);
		contentPane.add(txtCorreo);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(858, 484, 96, 33);
		contentPane.add(btnRegistrarse);

		txtrSeAadiran = new JTextArea();
		txtrSeAadiran.setEditable(false);
		txtrSeAadiran.setText(
				"se a�adiran 300 monedas una \r\nvez se halla registrado, una cierta \r\ncantidad de monedas se renovaran \r\ndiariamente");
		txtrSeAadiran.setBounds(429, 405, 293, 76);
		contentPane.add(txtrSeAadiran);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(642, 246, 180, 19);
		contentPane.add(dateChooser);
	}
}
