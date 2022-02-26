//TRANSFORMANDO A CLASSE ABSTRATA EM UMA INTERFACE

public abstract interface Autenticavel {

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
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
