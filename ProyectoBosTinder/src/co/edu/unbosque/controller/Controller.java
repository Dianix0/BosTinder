package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import co.edu.unbosque.view.GUI;

public class Controller implements ActionListener {

	private GUI g;

	public Controller() {
		this.g = new GUI(this);
		this.g.getVp().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(this.g.getVp().SALIR)) {
			this.g.getVp().dispose();
		}
		if (e.getActionCommand().equals(this.g.getVp().REGISTRARSE)) {
			this.g.getVp().dispose();
			this.g.getVr().setVisible(true);
		}
		if (e.getActionCommand().equals(this.g.getVp().SIGUIENTE)) {
			this.g.getVp().dispose();
			this.g.getVu().setVisible(true);
		}
		if (e.getActionCommand().equals(this.g.getVr().FINALIZAR)) {
			this.g.getVr().dispose();
			this.g.getVu().setVisible(true);
		}
		if (e.getActionCommand().equals(this.g.getVr().ATRAS)){
			this.g.getVp().setVisible(true);
			this.g.getVr().dispose();
		}
//		if (e.getActionCommand().equals(this.g.getVu().SALIR)){
//			this.g.getVp().setVisible(true);
//			this.g.getVu().dispose();
//		}
		if (e.getActionCommand().equals(this.g.getVu().LIKE)){
			System.out.println("Like");
		}
		if (e.getActionCommand().equals(this.g.getVu().DISLIKE)){
			System.out.println("Dislike");
		}
	}

}
