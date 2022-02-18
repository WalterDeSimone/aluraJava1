
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		// antes era assim para mudar numero conta
		//conta.numero = 1337;
		
		//agora é assim:
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		// Mudar a profissao
		//==========================================================//
		conta.getTitular().setProfissao("programador");
		
		//ou
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		//=========================================================//
	}
}
