package view;

import javax.swing.JOptionPane;

public class ViewCadastrarUsuario {
	//Atributos
	private String nome;
	private String matricula;
	private String curso;
	
	
	//Metodo construtor
	public ViewCadastrarUsuario(){
		//Solicitar o nome
		this.nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
		
		//Solicitar a matricula
		this.matricula = JOptionPane.showInputDialog("Digite a matrícula do usuário:");
		
		//Solicitar o curso
		this.curso = JOptionPane.showInputDialog("Digite o curso do usuário:");
	}


	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}
	
	

}
