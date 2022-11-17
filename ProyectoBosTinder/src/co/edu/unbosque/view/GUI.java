package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class GUI {
	private VentanaPrincipal vp;
	
	public GUI(Controller c) {
		this.vp = new VentanaPrincipal();
		vp.getButSalir().addActionListener(c);
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}
	
	
}
