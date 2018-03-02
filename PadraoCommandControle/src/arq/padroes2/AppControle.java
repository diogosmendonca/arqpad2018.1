package arq.padroes2;

import arq.padroes2.televisao.TelevisaoReceptor;

public class AppControle {

	public static void main(String[] args) {
		Controle c = new Controle(TelevisaoReceptor.getInstance());
		c.ligar();
		c.desligar();
	}

}
