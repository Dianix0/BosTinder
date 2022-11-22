package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaRegistrarse extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String FINALIZAR = "FINALIZAR";
	public static final String ATRAS = "ATRAS";

	private JLabel fondo;
	private JTextField txtNombre;
	private JTextField txtUsuario;
	private JTextField txtCorreo;
	private JTextField txtDiaFecha;
	private JTextField txtMesFecha;
	private JTextField txtAnoFecha;
	private JComboBox<String> sexo;
	private JLabel si;
	private JLabel no;
	private JRadioButton divorciosi;
	private JRadioButton divorciono;
	private ButtonGroup grupo;
	private JTextField estatura;
	private JTextField ingresos;
	private JTextField txtContrasena;
	private JButton butFinalizar;
	private JButton butAtras;

	public VentanaRegistrarse() {
		setLayout(null);
		setSize(600, 450);
		setResizable(false);
		this.setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 450);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("src/Images/VentanaRegistro.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado2));
		fondo.setVisible(true);

		this.txtNombre = new JTextField();
		this.txtNombre.setForeground(Color.GRAY);
		this.txtNombre.setBounds(190, 80, 300, 25);
		this.txtNombre.setBorder(null);

		this.txtUsuario = new JTextField();
		this.txtUsuario.setForeground(Color.GRAY);
		this.txtUsuario.setBounds(190, 110, 300, 25);
		this.txtUsuario.setBorder(null);

		this.txtContrasena = new JTextField();
		this.txtContrasena.setForeground(Color.GRAY);
		this.txtContrasena.setBounds(235, 327, 200, 25);
		this.txtContrasena.setBorder(null);

		this.txtCorreo = new JTextField();
		this.txtCorreo.setForeground(Color.GRAY);
		this.txtCorreo.setBounds(190, 140, 300, 25);
		this.txtCorreo.setBorder(null);

		this.txtDiaFecha = new JTextField("DD");
		this.txtDiaFecha.setForeground(Color.GRAY);
		this.txtDiaFecha.setBounds(340, 175, 40, 20);
		this.txtDiaFecha.setBorder(null);

		this.txtMesFecha = new JTextField("MM");
		this.txtMesFecha.setForeground(Color.GRAY);
		this.txtMesFecha.setBounds(390, 175, 40, 20);
		this.txtMesFecha.setBorder(null);

		this.txtAnoFecha = new JTextField("YYYY");
		this.txtAnoFecha.setForeground(Color.GRAY);
		this.txtAnoFecha.setBounds(440, 175, 40, 20);
		this.txtAnoFecha.setBorder(null);

		this.estatura = new JTextField();
		this.estatura.setForeground(Color.GRAY);
		this.estatura.setBounds(200, 265, 100, 25);
		this.estatura.setBorder(null);

		this.ingresos = new JTextField();
		this.ingresos.setForeground(Color.GRAY);
		this.ingresos.setBounds(335, 295, 100, 25);
		this.ingresos.setBorder(null);

		this.sexo = new JComboBox<String>();
		this.sexo.setForeground(Color.GRAY);
		this.sexo.addItem("");
		this.sexo.addItem("Femenino");
		this.sexo.addItem("Masculino");
		this.sexo.setBackground(Color.WHITE);
		this.sexo.setBounds(165, 205, 100, 25);

		this.si = new JLabel("Si");
		this.si.setFont(new Font("Arial", 0, 20));
		this.si.setForeground(Color.WHITE);
		this.si.setBounds(210, 238, 20, 20);

		this.divorciosi = new JRadioButton("Si", false);
		this.divorciosi.setContentAreaFilled(false);
		this.divorciosi.setBounds(230, 240, 15, 15);

		this.no = new JLabel("No");
		this.no.setFont(new Font("Arial", 0, 20));
		this.no.setForeground(Color.WHITE);
		this.no.setBounds(280, 235, 25, 25);

		this.divorciono = new JRadioButton("No", false);
		this.divorciono.setContentAreaFilled(false);
		this.divorciono.setBounds(310, 240, 15, 15);

		this.grupo = new ButtonGroup();
		this.grupo.add(this.divorciosi);
		this.grupo.add(this.divorciono);

		this.butFinalizar = new JButton();
		this.butFinalizar.setIcon(new ImageIcon("src/Images/Finalizar.png"));
		this.butFinalizar.setBounds(390, 380, 170, 50);
		this.butFinalizar.setActionCommand(FINALIZAR);
		this.butFinalizar.setBorder(null);

		this.butAtras = new JButton();
		this.butAtras.setIcon(new ImageIcon("src/Images/Atras.png"));
		this.butAtras.setBounds(40, 380, 170, 50);
		this.butAtras.setActionCommand(ATRAS);
		this.butAtras.setBorder(null);

		add(this.txtNombre);
		add(this.txtUsuario);
		add(this.txtContrasena);
		add(this.txtCorreo);
		add(this.txtDiaFecha);
		add(this.txtMesFecha);
		add(this.txtAnoFecha);
		add(this.sexo);
		add(this.estatura);
		add(this.ingresos);
		add(this.no);
		add(this.si);
		add(divorciono);
		add(divorciosi);
		add(this.butFinalizar);
		add(this.butAtras);
		add(fondo);
	}

	public JButton getButAtras() {
		return butAtras;
	}

	public void setButAtras(JButton butAtras) {
		this.butAtras = butAtras;
	}

	public static String getAtras() {
		return ATRAS;
	}

	public JLabel getSi() {
		return si;
	}

	public void setSi(JLabel si) {
		this.si = si;
	}

	public JLabel getNo() {
		return no;
	}

	public void setNo(JLabel no) {
		this.no = no;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(JTextField txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JComboBox<String> getSexo() {
		return sexo;
	}

	public void setSexo(JComboBox<String> sexo) {
		this.sexo = sexo;
	}

	public JButton getButFinalizar() {
		return butFinalizar;
	}

	public void setButFinalizar(JButton butFinalizar) {
		this.butFinalizar = butFinalizar;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JRadioButton getDivorciosi() {
		return divorciosi;
	}

	public void setDivorciosi(JRadioButton divorciosi) {
		this.divorciosi = divorciosi;
	}

	public JRadioButton getDivorciono() {
		return divorciono;
	}

	public void setDivorciono(JRadioButton divorciono) {
		this.divorciono = divorciono;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	public JTextField getEstatura() {
		return estatura;
	}

	public void setEstatura(JTextField estatura) {
		this.estatura = estatura;
	}

	public JTextField getIngresos() {
		return ingresos;
	}

	public void setIngresos(JTextField ingresos) {
		this.ingresos = ingresos;
	}

	public static String getFinalizar() {
		return FINALIZAR;
	}

}
