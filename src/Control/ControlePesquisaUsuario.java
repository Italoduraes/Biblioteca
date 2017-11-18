package Control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibeUsuario;
import view.ViewSolicitaMatricula;

public class ControlePesquisaUsuario {
	//Atributos
	private BDSimulado bds;
	
	public ControlePesquisaUsuario(BDSimulado bds){
		//Guardar o BDSimulado
		this.bds = bds;
	}
	
	//Metodo para pesquisar usuario
	public void pesquisarUsuario(){
		
		//Criar a view para solicitar a matricula
		ViewSolicitaMatricula vsm = new ViewSolicitaMatricula();
		
		//Recuperando a matricula digitada pelo usuario
		String matricula = vsm.getMatricula();
		
		//Retornar dados de usuario de acordo com a matricula
		Usuario usu = this.bds.getUsuarioPorMatricula(matricula);
		
		//Exibir os dados do usuario
		ViewExibeUsuario veu = new ViewExibeUsuario(usu);
	}

}
