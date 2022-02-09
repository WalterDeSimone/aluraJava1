
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente vc nao pode entrar");				
		}
		
		//====================================================================//
		
		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente vc nao pode entrar");				
		}
		//====================================================================//
		
		//====================================================================//
		boolean acompanhado = true;
		// ou
		// boolean acompanhado = quantidadePessoas >= 2;		
		
		
		// outra forma de fazer este if pode ser:
		// if (idade >= 18 && acompanhado == true) 
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente vc nao pode entrar");				
		}
		//====================================================================//
	}
}
