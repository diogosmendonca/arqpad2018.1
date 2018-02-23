package arq.padroes;

import java.util.List;
import java.util.Map;

public class SecurityServices2 extends SecurityServices{
	
	
	
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
}
