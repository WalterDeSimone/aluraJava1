
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //Faz referencia para objeto do tipo cliente
	
	private static int total;
	
	public Conta(int agencia, int numero) {
		total ++;
		if (agencia <= 0) {
			System.out.println("Numero incorreto de agencia");
			this.agencia = 1234;
		} else {
			this.agencia = agencia;
		}
		
		if (numero <= 0) {
			System.out.println("Numero incorreto da conta");
			this.numero = 111111;
		} else {
			this.numero = numero;
		}
		
		System.out.println("Estou criando uma agencia = " + this.agencia);
		System.out.println("Estou criando uma conta = " + this.numero);
	}
	
	public Conta(int numero) {
		this(1667, numero);
	}
	/*
	public void deposita(double valor) {
		this.saldo += valor;
	}
	*/
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Transação efetuada com sucesso");
			return true;
		} else {
			System.out.println("Transação nao pode ser excecutada");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} 
		return false;	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode ser valor menor que 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ser valor menor que 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}

}
