package arq.padroes;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter1  {
	
	private SomadorAdaptee somador = new SomadorAdaptee();
	
	public int SomarArray(Integer[] arrayInteiro){
		
		List<Integer> lista = new ArrayList<>();
		
		for (Integer valor : arrayInteiro) {
			lista.add(valor);
		}
		
		return somador.somaLista(lista);
	}	
}
