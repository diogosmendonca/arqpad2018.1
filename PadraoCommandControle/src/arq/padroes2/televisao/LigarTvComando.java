package arq.padroes2.televisao;

import arq.padroes2.Comando;

public class LigarTvComando implements Comando{

	@Override
	public void executaComando() {
		System.out.println("ligando televisao");
	}

}
