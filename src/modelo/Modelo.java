package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vista.Vista;
import vista._01_InicioSesion2;
import vista._02_Registro;

public class Modelo {

	private Vista miVista;
	private String usuario;

	// Atributos para la conexion mysql
	private String db = "ProyectoIntegrador";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + db
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private Connection conexion;

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}

	public void ConexionMySQL() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("-> Conexi�n con MySQL establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC No encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general de Conexion");
			e.printStackTrace();
		}
	}

	public boolean registro() {

		String nombre = ((_02_Registro) miVista).getNombre();
		String apellido1 = ((_02_Registro) miVista).getApellido1();
		String apellido2 = ((_02_Registro) miVista).getApellido2();
		String correo = ((_02_Registro) miVista).getCorreo();
		String fecha = ((_02_Registro) miVista).getfecha();
		String Pwd = ((_02_Registro) miVista).getPwd();
		String User = ((_02_Registro) miVista).getUser();
		ConexionMySQL();
		return registrarse(nombre, apellido1, apellido2, correo, fecha, Pwd, User);

	}

	public boolean registrarse(String nombre, String apellido1, String apellido2, String correo, String fecha,
			String Pwd, String User) {
		boolean resultado;
		try {
			String comprobarSiExiste = "SELECT correo, usuario FROM usuario WHERE correo=? OR usuario=?";
			PreparedStatement proII = conexion.prepareStatement(comprobarSiExiste);
			proII.setString(1, correo);
			proII.setString(2, User);
			ResultSet UsuarioExiste = proII.executeQuery();
			if (!UsuarioExiste.next()) {
				try {
					String insert = "INSERT INTO Usuario (nombre,Apellido1,Apellido2,monedas,Edad,Correo,contrase�a,Usuario) VALUES (?,?,?,?,?,?,?,?)";
					PreparedStatement proI = conexion.prepareStatement(insert);
					proI.setString(1, nombre);
					proI.setString(2, apellido1);
					proI.setString(3, apellido2);
					proI.setString(4, "50");
					proI.setString(5, fecha);
					proI.setString(6, correo);
					proI.setString(7, Pwd);
					proI.setString(8, User);
					proI.executeUpdate();
					proI.close();
					resultado = true;
					setUsuario(User);
				} catch (SQLException e) {
					System.err.println(e.getMessage());
					resultado = false;
				}
			} else {
				resultado = false;
			}
			proII.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
			resultado = false;
		}

		return resultado;
	}

	// Comprobamos que se puede pulsar el boton registrarse
	public boolean comprobarTodosRellenos(boolean nombre, boolean correo, boolean user, int password,
			boolean apellido1) {
		boolean todoRelleno = true;
		if (nombre || correo || user || apellido1 || password == 0) {
			todoRelleno = false;
		}

		return todoRelleno;
	}

	public boolean login(String usr, String pwd) {
		ConexionMySQL();
		try {

			String insert = "Select usuario, contrase�a from usuario";
			PreparedStatement proI = conexion.prepareStatement(insert);
			ResultSet rset = proI.executeQuery();
			while (rset.next()) {
				if (rset.getString(1).equals(usr) && rset.getString(2).equals(pwd)) {
					proI.close();
					setUsuario(usr);
					return true;
				}
			}
			proI.close();
			((_01_InicioSesion2) miVista).actualizar(false);
			return false;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
