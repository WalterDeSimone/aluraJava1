
public class TesteContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(1667, 11578);
		cc.deposita(100.0);
		
		Conta cp = new ContaPoupanca(1667, 58745);
		cp.deposita(200.0);
		
		System.out.println();
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		cc.transfere(10.0, cp);
		
		System.out.println();
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		cp.transfere(10, cc);
		
		System.out.println();
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		Cliente c1 = new Cliente();
		c1.setNome("Walter");
		c1.setCpf("213.224.854-87");
		c1.setProfissao("Estudante");
		
		cc.saca(100);
		System.out.println("CC: " + cc.getSaldo());
		
		cp.setTitular(c1);
		
		System.out.println(cp.getTitular().getNome());
		
		
	}

}
