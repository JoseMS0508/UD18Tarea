/*
 * @Author Javier Turienzo
 */
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Modelo;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class _07_CrearLigas2 extends JFrame implements Vista {

	// Atributos
	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel contentPane;
	private JLabel lblFondo;
	private JLabel lblLogo;
	private JPanel background;
	private JButton btnMiCuenta;
	private JButton btnVerLigas;
	private JButton btnCrearLiga;
	private JButton btnUnirseALiga;
	private JButton btnCrearEquipo;
	private JButton btnUnirseAEquipo;
	private JButton btnMisApuestas;
	private JButton btnApostar;
	private JButton btnSignOut;
	private Label lblCrearLiga;
	private JLabel lblBarraMoverVentana;
    private int xMouse, yMouse;
    private Label lblNombre;
    private JTextField txtNombre;
    private JTextField txtDeporte;
    private Label lblDeporte;
    private Label lblFecha;
    private JDateChooser dateFecha;
    private Label lblPrivacidad;
    private JRadioButton rdbtnPublica;
    private JRadioButton rdbtnPrivada;
	private ButtonGroup privacidad;
	private Label lblSede;
	private JTextField txtSede;
	private Label lblPremio;
	private JTextArea txtPremio;
	private JCheckBox chckbxPremio;
	private Label lblVictoria;
	private Label lblDerrota;
	private Label lblEmpate;
	private JSpinner spinnerVictoria;
	private JSpinner spinnerEmpate;
	private JSpinner spinnerDerrota;
	private JButton btnCrear;

	// Constructor
	public _07_CrearLigas2() {
		setTitle("Plantilla");
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLocationByPlatform(rootPaneCheckingEnabled);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1010, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(0, 128, 192));
		background.setBounds(0, 0, 1010, 539);
		contentPane.add(background);
		background.setLayout(null);

		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(_07_CrearLigas2.class.getResource("/img/fondoLogin2  - copia.jpg")));
		lblFondo.setBounds(0, 0, 283, 539);
		background.add(lblFondo);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(_07_CrearLigas2.class.getResource("/img/logo.png")));
		lblLogo.setBounds(290, 11, 150, 64);
		background.add(lblLogo);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(160, 160, 160));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(282, 0, 13, 537);
		background.add(separator);

		JLabel lblBtnCerrar = new JLabel("");
		lblBtnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
		    public void mouseEntered(MouseEvent e) {
				lblBtnCerrar.setBackground(Color.RED);
				lblBtnCerrar.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	lblBtnCerrar.setBackground(null);
		    	lblBtnCerrar.setOpaque(false);
		    }
		});
		lblBtnCerrar.setIcon(new ImageIcon(_07_CrearLigas2.class.getResource("/img/close.png")));
		lblBtnCerrar.setBounds(970, 0, 40, 40);
		background.add(lblBtnCerrar);

		JLabel lblBtnMinimizar = new JLabel("");
		lblBtnMinimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblBtnMinimizar.setIcon(new ImageIcon(_07_CrearLigas2.class.getResource("/img/minimize.png")));
		lblBtnMinimizar.setBounds(928, 0, 34, 40);
		background.add(lblBtnMinimizar);

		btnMiCuenta = new JButton("MI CUENTA");
		btnMiCuenta.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        btnMiCuenta.setBackground(Color.yellow);
		        btnMiCuenta.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        btnMiCuenta.setBackground(null);
		        btnMiCuenta.setOpaque(false);
		    }
		});

		btnMiCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		btnMiCuenta.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnMiCuenta.setBounds(10, 13, 262, 49);
		btnMiCuenta.setBorderPainted(false); 
        btnMiCuenta.setContentAreaFilled(false); 
		btnMiCuenta.setOpaque(false);
		btnMiCuenta.setFocusPainted(false);
		btnMiCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnMiCuenta);
		background.setComponentZOrder(btnMiCuenta, 0);
		
		btnVerLigas = new JButton("VER LIGAS");
		btnVerLigas.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnVerLigas.setBackground(Color.yellow);
		    	btnVerLigas.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnVerLigas.setBackground(null);
		    	btnVerLigas.setOpaque(false);
		    }
		});
		btnVerLigas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerLigas.setOpaque(false);
		btnVerLigas.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnVerLigas.setFocusPainted(false);
		btnVerLigas.setContentAreaFilled(false);
		btnVerLigas.setBorderPainted(false);
		btnVerLigas.setBounds(10, 62, 262, 49);
		btnVerLigas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnVerLigas);
		background.setComponentZOrder(btnVerLigas, 0);
		
		btnCrearLiga = new JButton("CREAR LIGA");
		btnCrearLiga.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnCrearLiga.setBackground(Color.yellow);
		    	btnCrearLiga.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnCrearLiga.setBackground(null);
		    	btnCrearLiga.setOpaque(false);
		    }
		});
		btnCrearLiga.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearLiga.setOpaque(false);
		btnCrearLiga.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnCrearLiga.setFocusPainted(false);
		btnCrearLiga.setContentAreaFilled(false);
		btnCrearLiga.setBorderPainted(false);
		btnCrearLiga.setBounds(10, 122, 260, 49);
		btnCrearLiga.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnCrearLiga);
		background.setComponentZOrder(btnCrearLiga, 0);
		
		btnUnirseALiga = new JButton("UNIRSE A LIGA");
		btnUnirseALiga.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnUnirseALiga.setBackground(Color.yellow);
		    	btnUnirseALiga.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnUnirseALiga.setBackground(null);
		    	btnUnirseALiga.setOpaque(false);
		    }
		});
		btnUnirseALiga.setHorizontalAlignment(SwingConstants.LEFT);
		btnUnirseALiga.setOpaque(false);
		btnUnirseALiga.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnUnirseALiga.setFocusPainted(false);
		btnUnirseALiga.setContentAreaFilled(false);
		btnUnirseALiga.setBorderPainted(false);
		btnUnirseALiga.setBounds(10, 182, 260, 49);
		btnUnirseALiga.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnUnirseALiga);
		background.setComponentZOrder(btnUnirseALiga, 0);
		
		btnCrearEquipo = new JButton("CREAR EQUIPO");
		btnCrearEquipo.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnCrearEquipo.setBackground(Color.yellow);
		    	btnCrearEquipo.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnCrearEquipo.setBackground(null);
		    	btnCrearEquipo.setOpaque(false);
		    }
		});
		btnCrearEquipo.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearEquipo.setOpaque(false);
		btnCrearEquipo.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnCrearEquipo.setFocusPainted(false);
		btnCrearEquipo.setContentAreaFilled(false);
		btnCrearEquipo.setBorderPainted(false);
		btnCrearEquipo.setBounds(10, 242, 260, 49);
		btnCrearEquipo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnCrearEquipo);
		background.setComponentZOrder(btnCrearEquipo, 0);
		
		btnUnirseAEquipo = new JButton("UNIRSE A EQUIPO");
		btnUnirseAEquipo.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnUnirseAEquipo.setBackground(Color.yellow);
		    	btnUnirseAEquipo.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnUnirseAEquipo.setBackground(null);
		    	btnUnirseAEquipo.setOpaque(false);
		    }
		});
		btnUnirseAEquipo.setHorizontalAlignment(SwingConstants.LEFT);
		btnUnirseAEquipo.setOpaque(false);
		btnUnirseAEquipo.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnUnirseAEquipo.setFocusPainted(false);
		btnUnirseAEquipo.setContentAreaFilled(false);
		btnUnirseAEquipo.setBorderPainted(false);
		btnUnirseAEquipo.setBounds(10, 302, 262, 49);
		btnUnirseAEquipo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnUnirseAEquipo);
		background.setComponentZOrder(btnUnirseAEquipo, 0);
		
		btnMisApuestas = new JButton("MIS APUESTAS");
		btnMisApuestas.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnMisApuestas.setBackground(Color.yellow);
		    	btnMisApuestas.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnMisApuestas.setBackground(null);
		    	btnMisApuestas.setOpaque(false);
		    }
		});
		btnMisApuestas.setHorizontalAlignment(SwingConstants.LEFT);
		btnMisApuestas.setOpaque(false);
		btnMisApuestas.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnMisApuestas.setFocusPainted(false);
		btnMisApuestas.setContentAreaFilled(false);
		btnMisApuestas.setBorderPainted(false);
		btnMisApuestas.setBounds(10, 362, 262, 49);
		btnMisApuestas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnMisApuestas);
		background.setComponentZOrder(btnMisApuestas, 0);
		
		btnApostar = new JButton("APOSTAR");
		btnApostar.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnApostar.setBackground(Color.yellow);
		    	btnApostar.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnApostar.setBackground(null);
		    	btnApostar.setOpaque(false);
		    }
		});
		btnApostar.setHorizontalAlignment(SwingConstants.LEFT);
		btnApostar.setOpaque(false);
		btnApostar.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnApostar.setFocusPainted(false);
		btnApostar.setContentAreaFilled(false);
		btnApostar.setBorderPainted(false);
		btnApostar.setBounds(10, 422, 260, 49);
		btnApostar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnApostar);
		background.setComponentZOrder(btnApostar, 0);
		
		btnSignOut = new JButton("Sign Out");
		btnSignOut.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnSignOut.setBackground(Color.yellow);
		    	btnSignOut.setOpaque(true);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnSignOut.setBackground(null);
		    	btnSignOut.setOpaque(false);
		    }
		});
		btnSignOut.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignOut.setOpaque(false);
		btnSignOut.setFont(new Font("Britannic Bold", Font.BOLD, 15));
		btnSignOut.setFocusPainted(false);
		btnSignOut.setContentAreaFilled(false);
		btnSignOut.setBorderPainted(false);
		btnSignOut.setBounds(10, 470, 262, 49);
		btnSignOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnSignOut);
		background.setComponentZOrder(btnSignOut, 0);
		
		lblCrearLiga = new Label("Crear Liga");
		lblCrearLiga.setAlignment(Label.CENTER);
		lblCrearLiga.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		lblCrearLiga.setBounds(556, 35, 211, 40);
		background.add(lblCrearLiga);
		
		lblNombre = new Label("Nombre*");
		lblNombre.setFont(new Font("Britannic Bold", Font.BOLD, 13));
		lblNombre.setBounds(333, 122, 107, 24);
		background.add(lblNombre);
		
		lblBarraMoverVentana = new JLabel("");
        lblBarraMoverVentana.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int xPantalla = e.getXOnScreen();
                int yPantalla = e.getYOnScreen();
                setLocation(xPantalla - xMouse, yPantalla - yMouse);
            }
        });

        lblBarraMoverVentana.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xMouse = e.getX();
                yMouse = e.getY();
            }
        });
        lblBarraMoverVentana.setBounds(0, 0, 918, 23);
        background.add(lblBarraMoverVentana);
        
        txtNombre = new JTextField();
        txtNombre.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        txtNombre.setBounds(456, 122, 150, 24);
        background.add(txtNombre);
        txtNombre.setColumns(10);
        
        txtDeporte = new JTextField();
        txtDeporte.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        txtDeporte.setColumns(10);
        txtDeporte.setBounds(456, 195, 150, 24);
        background.add(txtDeporte);
        
        lblDeporte = new Label("Deporte*");
        lblDeporte.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblDeporte.setBounds(333, 195, 107, 24);
        background.add(lblDeporte);
        
        dateFecha = new JDateChooser();
        dateFecha.setBounds(456, 265, 150, 24);
        background.add(dateFecha);
        
        lblFecha = new Label("Fecha de inicio*");
        lblFecha.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblFecha.setBounds(333, 264, 117, 24);
        background.add(lblFecha);
        
        lblPrivacidad = new Label("Privacidad");
        lblPrivacidad.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblPrivacidad.setBounds(333, 338, 117, 24);
        background.add(lblPrivacidad);
        
        privacidad = new ButtonGroup();
        
        rdbtnPublica = new JRadioButton("P\u00FAblica");
        rdbtnPublica.setBackground(new Color(0, 128, 192));
        rdbtnPublica.setBounds(457, 338, 70, 23);
        background.add(rdbtnPublica);
        privacidad.add(rdbtnPublica);
        
        rdbtnPrivada = new JRadioButton("Privada");
        rdbtnPrivada.setSelected(true);
        rdbtnPrivada.setBackground(new Color(0, 128, 192));
        rdbtnPrivada.setBounds(536, 338, 70, 23);
        background.add(rdbtnPrivada);
        privacidad.add(rdbtnPrivada);
        
        lblSede = new Label("Sede");
        lblSede.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblSede.setBounds(333, 418, 107, 24);
        background.add(lblSede);
        
        txtSede = new JTextField();
        txtSede.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        txtSede.setColumns(10);
        txtSede.setBounds(456, 418, 150, 24);
        background.add(txtSede);
        
        lblPremio = new Label("Premio");
        lblPremio.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblPremio.setBounds(678, 332, 60, 24);
        background.add(lblPremio);
        
        chckbxPremio = new JCheckBox("");
        chckbxPremio.setBackground(new Color(0, 128, 192));
        chckbxPremio.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPremio.setBounds(742, 333, 23, 23);
        background.add(chckbxPremio);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(771, 338, 189, 126);
        background.add(scrollPane);
        
        txtPremio = new JTextArea();
        txtPremio.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        scrollPane.setViewportView(txtPremio);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBounds(665, 122, 7, 356);
        background.add(separator_1);
        
        lblVictoria = new Label("Puntos por victoria");
        lblVictoria.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblVictoria.setBounds(678, 122, 133, 24);
        background.add(lblVictoria);
        
        lblDerrota = new Label("Puntos por derrota");
        lblDerrota.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblDerrota.setBounds(678, 195, 133, 24);
        background.add(lblDerrota);
        
        lblEmpate = new Label("Puntos por empate");
        lblEmpate.setFont(new Font("Britannic Bold", Font.BOLD, 13));
        lblEmpate.setBounds(678, 267, 133, 24);
        background.add(lblEmpate);
        
        spinnerVictoria = new JSpinner();
        spinnerVictoria.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        spinnerVictoria.setModel(new SpinnerNumberModel(Integer.valueOf(3), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerVictoria.setBounds(902, 125, 60, 20);
        background.add(spinnerVictoria);
        
        spinnerDerrota = new JSpinner();
        spinnerDerrota.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        spinnerDerrota.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerDerrota.setBounds(902, 196, 60, 20);
        background.add(spinnerDerrota);
        
        spinnerEmpate = new JSpinner();
        spinnerEmpate.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        spinnerEmpate.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerEmpate.setBounds(902, 270, 60, 20);
        background.add(spinnerEmpate);
        
        btnCrear = new JButton("Crear Liga");
        btnCrear.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
        btnCrear.setBounds(773, 478, 107, 41);
        background.add(btnCrear);
        

	}

	@Override
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;

	}

	@Override
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}
