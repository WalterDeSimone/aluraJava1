
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1667, 11578);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(1667, 58745);
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
		
	}

}
