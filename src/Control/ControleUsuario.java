package Control;


import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewCadastrarUsuario;
import view.ViewExibeListaUsuarios;

public class ControleUsuario {
	//Atributos
	private BDSimulado bds;
	
	
	//Metodo construtor
	public ControleUsuario(BDSimulado bds){
		//Guardar o BDSimulado
		this.bds = bds;
	}
	
	//Metodo para cadastrar usuario
	public void cadastrarUsuario(){
		
		//Solicitar dados do usuario
		ViewCadastrarUsuario vcu = new ViewCadastrarUsuario();
		
		// Criar objeto usuario com os dados digitados
		Usuario usuario = new Usuario(vcu.getNome(), vcu.getMatricula(), vcu.getCurso());
		
		//Colocar o usuario na lista de usuarios
		this.bds.insereUsuario(usuario);
		
		//Recuperar a lista de usuarios
		ArrayList<Usuario> usuarios = this.bds.getUsuarios();
		
		//Criar uma string representando todos os usuarios da lista
		String s = "";
		for (int i = 0; i < usuarios.size(); i++) {
			s = s + "----------------\n" + usuarios.get(i);
		}
		
		//Exibir a lista de usuarios
		ViewExibeListaUsuarios velu = new ViewExibeListaUsuarios(s);
	}

}
