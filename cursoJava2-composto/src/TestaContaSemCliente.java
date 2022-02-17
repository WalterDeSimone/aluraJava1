
public class TestaContaSemCliente {
	public static void main(String[] args) {
		//aqui eu crio uma conta
		Conta contaDaMarcela = new Conta();
		
		//Outra forma de criar um cliente(classe), comparar com TesteBanco.java
		contaDaMarcela.titular = new Cliente();
		
		System.out.println(contaDaMarcela.saldo);
		
		
		
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
