
//Gerente é um Funcionario, Gerente herda da classe Funcionario

public class Gerente extends Funcionario{
	

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;	
		}
	}
	
	public double getBonificacao () {
		return super.getSalario(); //super. indica que vem da classe mae, que nao esta definido nesta classe, retirado o this.
	}


}
