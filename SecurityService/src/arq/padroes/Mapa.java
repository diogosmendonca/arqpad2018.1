package arq.padroes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
	
	 public static Map getMapa(){
		
		 Map<String, List> mapa = new HashMap<String, List>();
		 
		 List lista = new ArrayList();
		 lista.add("Controle");
		 lista.add("Financeiro");
		 lista.add("Operação");
		 
		 mapa.put("Augusto", lista);
		 mapa.put("Pedro", lista);
		 mapa.put("Padu", lista);
		 
		 return mapa;
		 
	 }
	
}
