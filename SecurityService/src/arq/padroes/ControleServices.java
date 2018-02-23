package arq.padroes;

public class ControleServices {
	public static void cadastrarNota() {
		SecurityInterface security = new SecurityServices2();
		if(!security.hasAccess("Padu", "Controle")){
			System.out.println("Sem acesso");
		} else {
			System.out.println("Foiii");
		}
		
	}
}
