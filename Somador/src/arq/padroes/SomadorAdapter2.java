package arq.padroes;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter2 extends SomadorAdaptee implements  SomadorNovo{
	
	public int SomarArray(Integer[] arrayInteiro){
		List<Integer> lista = new ArrayList<>();
		
		for (Integer valor : arrayInteiro) {
			lista.add(valor);
		}
		
		return somaLista(lista);
	}	

	
}
