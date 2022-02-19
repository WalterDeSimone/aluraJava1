

public class Conta {
	//Abaixo segue os atributos da conta bancaria
	// pode se tratar como uma especificação para a classe Conta
	
	//Objeto ou instancia é criado a partir da classe Conta, ou seja,
	// a partir das especificações da Classe Conta

	// Quando vc colocar um atributo é privado,
	// ele nao podera ser alterado e nem lido, nao pode ser acessado
	// nao pode imprimor no syso
	// solucao para imprimir é criar um metodo dentro desta classe
	// para imprimir o saldo neste caso

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //Faz referencia para objeto do tipo cliente
	
	//quando colocamos static ele fala que a variavel abaixo
	//ela é para quantidade de contas da classe, sem isso
	//ele vai somar apenas 1 em cada objeto criado
	//se vc coloca o static ele soma todos os objetos criados
	//diferente
	private static int total;
	
	//codigo abaixo é o construtor, que exige no momento de criar um objeto
	// que o atributos basicos sejam solicitadas na criação dele
	//neste caso definimos que numero conta e numero agencia
	//sao atributos basicos e excenciais na criacao de um objeto da
	//classe conta
	
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
		///System.out.println("Total de contas é " + total);
		System.out.println("Estou criando uma conta = " + this.numero);
	}
	
	//Pode criar 2 contrutores com o mesmo nome, porem com atributos 
	// para serem exigidos diferentes, no momento de criar o objeto
	//o dev ira escolher qual construtor vai chamar
	
	//e o melhor, eu posso chamar o contrutor acima, com este contrutor
	//abaixo utilizando o thi()
	//apenas faço a edicao do que preciso de atributo e coloco na mao
	// assim como agencia 1667 abaixo
	//com isso eu nao preciso ficar repetindo if nos 2 contrutores
	//faco as condicoes em apenas 1
	public Conta(int numero) {
		//1667 = agencia
		//numero é o numero que a classe main chama
		this(1667, numero);

	}
	
	
	// MEtodos serão iniciados abaixo
	
	// se usar o void, isso significa que nao retorna valores para quem
	// esta chamando ele
	
	public void deposita(double valor) {
		
		//this. referencia a qual conta ele esta invocando
		//duas formas de usar matematica no java
		//this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	// neste caso ele vai retornar um valor, tendo em vista que
	// nao utilizamos o void
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			//duas formas de usar matematica no java
			//this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	
	//no caso conta abaixo não se trata do tipo de variavel
	//e sim de uma referencia, qual Conta sera a destino,
	//qual conta vai sair a grana
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		
		return false;	
	}
	
	
	// metodo que devolve o saldo
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
