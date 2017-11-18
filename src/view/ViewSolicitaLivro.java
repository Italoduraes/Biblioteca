package view;

import javax.swing.JOptionPane;

public class ViewSolicitaLivro {

	//Atributos
			private String livro;
			
			public ViewSolicitaLivro() {
				this.livro = 	
						JOptionPane.showInputDialog("Digite o nome do Livro");
			}

			public String getLivro() {
				return livro;
			}
			
}
