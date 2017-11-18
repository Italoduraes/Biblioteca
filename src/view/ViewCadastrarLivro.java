package view;

import javax.swing.JOptionPane;

public class ViewCadastrarLivro {
	
	// Atributos 
	
	private String titulo;
	private String autor;
	private String editora;
	private String anoLancamento;
	private String ISBN;
	

	//Metado construtor
		public ViewCadastrarLivro() {
			//Solicitar nome
			this.titulo = JOptionPane.showInputDialog("Digite o titulo do livro?");
			
			// Solicitar matricula
			this.autor = JOptionPane.showInputDialog("Digite o autor do livro?");
			
			// Solicitar curso
			this.editora = JOptionPane.showInputDialog("Digite o editora do livro?");
			
			// Solicitar Ano de Lançamento
			this.anoLancamento = JOptionPane.showInputDialog("Digite o ano lancamento do livro?");
			
			// Solicitar  ISBN
			this.ISBN = JOptionPane.showInputDialog("Digite o ISBN do livro?");
		}

		public String getTitulo() {
			return titulo;
		}

		public String getAutor() {
			return autor;
		}

		public String getEditora() {
			return editora;
		}

		public String getAnoLancamento() {
			return anoLancamento;
		}

		public String getISBN() {
			return ISBN;
		}

}
