
//Gerente é um Funcionario, Gerente herda da classe Funcionario, assina o contratro
//(interface) com autenticavel.class

public class Gerente extends Funcionario implements Autenticavel{
	
/*
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
	*/
	
	public double getBonificacao () {
		return super.getSalario(); //super. indica que vem da classe mae, que nao esta definido nesta classe, retirado o this.
	}

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
