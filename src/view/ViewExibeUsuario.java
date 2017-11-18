package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibeUsuario {
	
	public ViewExibeUsuario(Usuario usuario){
		//Verificar se tem usuario para mostrar
		if (usuario == null) {
			JOptionPane.showMessageDialog(null, "Usuário não existe");
		} else {
			//Exibir com JOptionPane
			JOptionPane.showMessageDialog(null, usuario);			
		}
	}

}
