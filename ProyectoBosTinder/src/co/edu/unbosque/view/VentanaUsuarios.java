package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaUsuarios extends JFrame {

	public static final String LIKE = "LIKE";
	public static final String DISLIKE = "DISLIKE";
	public static final String SALIR = "SALIR";

	private JLabel fondo;
	private JButton butLike;
	private JButton butDislike;
	private JButton butSalir;

	public VentanaUsuarios() {
		setLayout(null);
		setSize(600, 450);
		setResizable(false);
		this.setUndecorated(true);
		setLocationRelativeTo(null);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 450);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("src/Images/VentanaUsuarios.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado2));
		fondo.setVisible(true);

		this.butSalir = new JButton("Salir");
		this.butSalir.setFont(new Font("OpenSans", Font.BOLD, 20));
		this.butSalir.setForeground(Color.WHITE);
		this.butSalir.setContentAreaFilled(false);
		this.butSalir.setBorder(null);
//		this.butSalir.setIcon(new ImageIcon("src/Images/Salir.png"));
		this.butSalir.setBounds(520, 10, 80, 30);
		this.butSalir.setActionCommand(SALIR);

		this.butLike = new JButton();
		this.butLike.setBounds(370, 355, 60, 60);
		this.butLike.setBorder(null);
		this.butLike.setContentAreaFilled(false);

		this.butDislike = new JButton();
		this.butDislike.setBounds(165, 355, 60, 60);
		this.butDislike.setBorder(null);
		this.butDislike.setContentAreaFilled(false);

		add(butLike);
		add(butDislike);
		add(butSalir);
		add(fondo);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getButLike() {
		return butLike;
	}

	public void setButLike(JButton butLike) {
		this.butLike = butLike;
	}

	public JButton getButDislike() {
		return butDislike;
	}

	public void setButDislike(JButton butDislike) {
		this.butDislike = butDislike;
	}

	public JButton getButSalir() {
		return butSalir;
	}

	public void setButSalir(JButton butSalir) {
		this.butSalir = butSalir;
	}

	public static String getLike() {
		return LIKE;
	}

	public static String getDislike() {
		return DISLIKE;
	}

	public static String getSalir() {
		return SALIR;
	}

}
