

public class Conta {
		//Abaixo segue os atributos da conta bancaria
		// pode se tratar como uma especificação para a classe Conta
		
		//Objeto ou instancia é criado a partir da classe Conta, ou seja,
		// a partir das especificações da Classe Conta
	
	
		double saldo;
		int agencia;
		int numero;
		Cliente titular; //Faz referencia para objeto do tipo cliente
		
		
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

}
