package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import co.edu.unbosque.view.GUI;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private GUI g;
	
	public Controller() {
		this.g = new GUI(this);

	}
	
	public void iniciar() {
		g.getVp().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(g.getVp().SALIR)) {
			this.g.getVp().dispose();
			this.g.getVp().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	}

}
