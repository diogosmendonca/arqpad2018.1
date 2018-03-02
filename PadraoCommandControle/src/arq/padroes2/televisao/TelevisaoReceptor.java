package arq.padroes2.televisao;

import java.util.HashMap;

import arq.padroes2.Comando;
import arq.padroes2.Receptor;

public class TelevisaoReceptor implements Receptor{
	
	private TelevisaoReceptor(){}
	
	private static TelevisaoReceptor instance;
	
	public static TelevisaoReceptor getInstance(){
		if(instance == null)
			instance = new TelevisaoReceptor();
		return instance;
	}
	
	private static HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	
	static{
		comandos.put("1", new LigarTvComando());
		comandos.put("2", new DesligarTvComando());
	}
	
	public void invocarComando(String codigo) {
		if(comandos.get(codigo) != null)
			comandos.get(codigo).executaComando();
	}
	
}
