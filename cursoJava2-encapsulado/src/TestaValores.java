
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(145, 555);
		
		System.out.println(conta.getAgencia()+ "" + " - " + conta.getNumero());
		Conta conta1 = new Conta(145, 555);
		
		//chamar get para a classe:
		//{NomeDaClasse}.getTotal();
		System.out.println(Conta.getTotal());
		
		
		Conta contaTeste = new Conta(478, 556);
		System.out.println(Conta.getTotal());
	}
}
