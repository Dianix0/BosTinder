package co.edu.unbosque.model;

import java.util.ArrayList;

public class UsuarioDAO {
	private ArrayList<UsuarioDTO> usuarios;
	
	public void agregarUsuario(UsuarioDTO pUsuario) {
		this.usuarios.add(pUsuario);
	}
	
	public ArrayList<UsuarioDTO> listarUsuarios(){
		return this.usuarios;
	}
}


