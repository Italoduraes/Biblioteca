package Control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibeEmprestimos;
import view.ViewExibeEmprestimosString;

public class ControleExibeEmprestimos {
	//Atributos
	private BDSimulado bds;
	
	public ControleExibeEmprestimos(BDSimulado bds){
		//Guardar o BD Simulado
		this.bds = bds;
	}
	
	//Metodo que exibe todos os emprestimos
	public void exibirEmprestimos(){
		
		//Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = this.bds.getEmprestimos();
		
		//Exibir todos os emprestimos
		ViewExibeEmprestimos vee = new ViewExibeEmprestimos(emprestimos);
		
		//Exibir todos os emprestimos usando outra classe
		String s = "";
		
		for (int i = 0; i < emprestimos.size(); i++) {
			s = s + "--------------\n" + emprestimos.get(i);
		}
		
		ViewExibeEmprestimosString vees = new ViewExibeEmprestimosString(s);
	}

}
