package arq.padroes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityServices implements SecurityInterface {
	
	private static SecurityInterface instancia;
	
	private SecurityServices (){
		Map<String, List> mapa = new HashMap<String, List>();
		 
		 List lista = new ArrayList();
		 lista.add("Controle");
		 lista.add("Financeiro");
		 lista.add("Operação");
		 
		 mapa.put("Augusto", lista);
		 mapa.put("Pedro", lista);
		 mapa.put("Padu", lista);	 
		 
	}
	
	/* (non-Javadoc)
	 * @see arq.padroes.SecurityInterface#hasAccess(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean hasAccess(String identificador, String metodo) {
		Map mapa = Mapa.getMapa();
		if(!mapa.containsKey(identificador)){
			return false;
		}else {
			List valores = (List) mapa.get(identificador);
			if(valores.contains(metodo)){
				return true;
			}
		}
		
		return false;
	}
	
	public static SecurityInterface getInstance(){
		 
		if(instancia == null)
			instancia = new SecurityServices();
		return instancia;

		
	}
}
