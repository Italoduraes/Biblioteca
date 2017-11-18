package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//atributos
	private String opcao;
	
	//Metodo para exibir a lista de opcoes
	public String getOpcao(){
		
		this.opcao =  JOptionPane.showInputDialog(
				"Escolha uma opção\n" +
				"1 - Cadastrar usuário\n" +
				"2 - Pesquisar usuário\n" +
				"3 - Listar empréstimos\n" +
				"4 - Sair\n");
		
		return this.opcao;
	}

}
