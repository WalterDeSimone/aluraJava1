
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario(); // criando objeto e chamando o construtor
		nico.setNome("Nicolas");
		nico.setCpf("1111111111-11");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
		
	}

}
