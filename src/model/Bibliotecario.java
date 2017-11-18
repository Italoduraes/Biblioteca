package model;

public class Bibliotecario {
	//Atributos
	private String nome;
	private String matricula;
	
	public Bibliotecario(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
