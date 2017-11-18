package Control;

import model.BDSimulado;
import model.Livro;
import view.ViewExibeLivro;
import view.ViewSolicitaLivro;

public class ControleExibeLivro {
	
public ControleExibeLivro(){
		
		BDSimulado bds = new BDSimulado();
		//Criar a view para solicitar matricula
				ViewSolicitaLivro vsl = new ViewSolicitaLivro();
				
				String livro = vsl.getLivro();
				
				//Retornar dados do livro de acordo com a titulo
				Livro liv = bds.getLivroPorTitulo(livro);
				
				//Exibir os dados do Livro
				ViewExibeLivro vel = new ViewExibeLivro(liv);
	}

}
