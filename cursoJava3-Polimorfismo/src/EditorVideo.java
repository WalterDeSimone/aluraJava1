
//Gerente é um Funcionario, Gerente herda da classe Funcionario

public class EditorVideo extends Funcionario{
	
	public double getBonificacao () {
		return super.getBonificacao() + 100; //super. indica que vem da classe mae, que nao esta definido nesta classe, retirado o this.
	}


}
