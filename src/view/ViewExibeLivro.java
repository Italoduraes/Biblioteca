package view;

import javax.swing.JOptionPane;

import model.Livro;

public class ViewExibeLivro {

	public ViewExibeLivro(Livro livro){
	//Verificar se tem usuario para mostrar 
	if (livro==null) {
			JOptionPane.showMessageDialog(null, "Este titulo n�o existe");
		}else {
	//Exibir com JOptionPane
	JOptionPane.showMessageDialog(null, livro);
		}
}

}
