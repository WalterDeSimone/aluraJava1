
//Gerente é um Funcionario, Gerente herda da classe Funcionario

public class EditorVideo extends Funcionario{
	
	public double getBonificacao () {
		return 150; //super. indica que vem da classe mae, que nao esta definido nesta classe, retirado o this.
	}


}
