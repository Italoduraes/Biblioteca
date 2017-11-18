package Control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewPrincipal;

public class ControlePrincipal {
	//Atributos 
	
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControleExibeEmprestimos cee;
	private ControlePesquisaUsuario cpu;
    private ControleUsuario cu;

	// Metodo contrutor 
	
	public ControlePrincipal(){
		// instanciar o objeto BDSimulado
		this.bds = new BDSimulado();
		
		//Instanciar a ViewPrincipal
		this.vp = new  ViewPrincipal();
		
	// Criar controles 
		this.cee= new ControleExibeEmprestimos(bds);
		this.cpu = new ControlePesquisaUsuario(bds);
		this.cu = new ControleUsuario(bds);
		
		//Exibir a janela de op�oes pela primeira vez 
		
		tratarOpcao(this.vp.getOpcao());
		
	}
	
	// Metodo para tratar a op�ao do usuario
	
	public void tratarOpcao ( String opcao){
		while (true) {
			switch (opcao) {
			case "1": this.cu.cadastrarUsuario();
				break;

			case "2": this.cpu.pesquisarUsuario();	
				break;
				
			case "3": this.cee.exibirEmprestimos();	
				break;
				
			case "4": JOptionPane.showMessageDialog(null, "At� breve!" );	
				return;
				
			default: JOptionPane.showMessageDialog(null, "Favor digitar um valor v�lido! ");
				break;
			}
			
			// Exibir a janela de op�oes 
			
			opcao = this.vp.getOpcao();
			
			
			
		}
	}
	
	
	
	
	

}
