package Control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Livro;
import view.ViewCadastrarLivro;
import view.ViewExibeListaLivros;

public class ControleLivro {
	

	//metado construtor
		public ControleLivro(){
			
			//Criar BDSimulado
			BDSimulado bds = new BDSimulado();
			
			// Solicitar dados do livro 
			ViewCadastrarLivro vcl = new ViewCadastrarLivro();
			
			//Criar livro com os dados digitados
			Livro livro = new Livro(vcl.getTitulo(), vcl.getAutor(), vcl.getEditora(), vcl.getAnoLancamento(), vcl.getISBN());
			
			//Colocar o livro na lista de livro
			bds.insereLivro(livro);
			
			ArrayList<Livro> livros = bds.getLivros();
			
			//Criar uma String representando todos os livro da lista 
			String l = "";
			for (int i = 0; i < livros.size(); i++) {
				l = l +  "----------------\n" + livros.get(i);
			}
			
			//Exibir a lista de livros
			ViewExibeListaLivros vell = new ViewExibeListaLivros(l);

	}
	

}