package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	//Atributos
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public BDSimulado() {
		//Criando livros
		Livro l1 = new Livro("Livro 1", "Autor 1", "Editora A", "2012", "123");
		Livro l2 = new Livro("Livro 2", "Autor 2", "Editora A", "2016", "456");
		Livro l3 = new Livro("Livro 3", "Autor 2", "Editora B", "2017", "789");
		//Adicionando livros
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);
		
		//Criando Usuarios
		Usuario u1 = new Usuario("João da Silva", "RA3434", "Direito");
		Usuario u2 = new Usuario("Maria Joaquina", "RA1234", "Nutrição");
		//Adicionando usuarios
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		
		//Criando Bibliotecarios
		Bibliotecario b1 = new Bibliotecario("Marcio", "123456");
		Bibliotecario b2 = new Bibliotecario("José", "654321");
		Bibliotecario b3 = new Bibliotecario("Thais", "676666");
		//Adicionando bibliotecarios
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);
		
		//Criando Emprestimos
		Emprestimo e1 = new Emprestimo(l1, u1, b1,
				LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 15));
		Emprestimo e2 = new Emprestimo(l2, u2, b1,
				LocalDate.of(2017, 10, 11), LocalDate.of(2017, 10, 16));
		Emprestimo e3 = new Emprestimo(l3, u1, b2,
				LocalDate.of(2017, 10, 18), LocalDate.of(2017, 10, 23));
		//Adicionando emprestimos
		this.emprestimos.add(e1);
		this.emprestimos.add(e2);
		this.emprestimos.add(e3);
		
	}
	
	//Recupera o arraylist de emprestimos
	public ArrayList<Emprestimo> getEmprestimos(){
		return this.emprestimos;
	}
	
	//Recupera o arraylist de usuarios
	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	//Recuperar o arraylist de livros
		public ArrayList<Livro> getLivros(){
			return this.livros;
		}
	
	
	//Retorna usuario de acordo com a matricula
	public Usuario getUsuarioPorMatricula(String matricula){
		Usuario retorno = null;
		
		//Percorrer a lista de usuarios
		for (int i = 0; i < this.usuarios.size(); i++) {
			if (this.usuarios.get(i).getMatricula().equals(matricula)) {
				retorno = this.usuarios.get(i);
			}
		}
		
		return retorno;
	}
	

	public Livro getLivroPorTitulo(String titulo){
		Livro retorno = null;
		
		//Percorrer a lista de usuarios
		for (int i = 0; i < this.livros.size(); i++) {
			if (this.livros.get(i).getTitulo().equals(titulo)) {
				retorno = this.livros.get(i);
			}
		}
		
		return retorno;
	}
	
	//Insere um usuario na lista de usuarios
	public void insereUsuario(Usuario usuario){
		this.usuarios.add(usuario);
	}
	

	public void insereLivro(Livro livro) {
		this.livros.add(livro);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
