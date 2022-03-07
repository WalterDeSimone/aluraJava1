
public class TesteConexao {

	public static void main(String[] args) {
		
		
		// Tudo que é feito no comentario abaixo, é possivel fazer de foma
		// mais simples com o Try em seguida:
		// ele abre a conexao e faz as tratativas que sao chamadas
		// e encerra sem chamar o con.close()
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro na conexao");
		}
		
	
		//-----------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//				con.close();
//			}
//		}
		
		
	}

}
