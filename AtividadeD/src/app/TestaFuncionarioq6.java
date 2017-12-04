package app;
import model.*;
public class TestaFuncionarioq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*É um caso de polimorfismo pois o metodo getBonificacao()
		 *que é chamado é o da classe gerente reescrito nessa classe
		 */
		FuncionarioQ6 gerente = new Gerente();
		gerente.setSalario(1000);
		System.out.println(gerente.getBonificacao()); 
	}

}
