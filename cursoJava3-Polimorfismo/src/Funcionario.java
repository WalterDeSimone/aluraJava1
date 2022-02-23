//nao pode instanciar desta classe ou seja, nao pode criar objetos a partir
//desta classe, somente das herdeiras que nao sao abstratas

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected double salario; //protected torna publico apenas para os herdeiros desta classe
	private double salario;
	
	/*
	public double getBonificacao () {
		return this.salario * 0.05;
	}
	*/

	//abstract no metodo, significa que ele nao tem um corpo, que nao
	//foi implementado
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
