package arq.padroes2.televisao;

import arq.padroes2.Comando;

public class DesligarTvComando implements Comando{

	@Override
	public void executaComando() {
		System.out.println("desligando televisão");	
	}

}
