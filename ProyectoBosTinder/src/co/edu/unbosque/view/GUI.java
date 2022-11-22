package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class GUI {
	private VentanaPrincipal vp;
	private VentanaRegistrarse vr;
	private VentanaUsuarios vu;

	public GUI(Controller c) {
		this.vp = new VentanaPrincipal();
		vp.getButSalir().addActionListener(c);
		vp.getButRegistrarse().addActionListener(c);
		vp.getButSiguiente().addActionListener(c);

		this.vr = new VentanaRegistrarse();
		this.vr.getButFinalizar().addActionListener(c);
		this.vr.getButAtras().addActionListener(c);

		this.vu = new VentanaUsuarios();
		this.vu.getButSalir().addActionListener(c);
		this.vu.getButDislike().addActionListener(c);
		this.vu.getButLike().addActionListener(c);
	}

	public VentanaUsuarios getVu() {
		return vu;
	}

	public void setVu(VentanaUsuarios vu) {
		this.vu = vu;
	}

	public VentanaRegistrarse getVr() {
		return vr;
	}

	public void setVr(VentanaRegistrarse vr) {
		this.vr = vr;
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

}
