package arq.padroes2;

public class Controle {
	
	public ComandoTelevisao ctv = new ComandoTelevisao();
	
	public void ligar(){
		ctv.executar("1");
	}
	
		//Televisao.ligar();
	//}
	/*
	public void desligar();
	//	Televisao.desligar();
//	}
	
	public void avancarCanal();
//		Televisao.avancarCanal();
	//}

	public void voltarCanal();
		//Televisao.voltarCanal();
	//} */

	
}
