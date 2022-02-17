
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//associa o cliente paulo para a conta contaDoPaulo
		contaDoPaulo.titular = paulo; //faz referencia a paulo, atribui referencia ao
										// ao atributo
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.saldo);
	}

}
