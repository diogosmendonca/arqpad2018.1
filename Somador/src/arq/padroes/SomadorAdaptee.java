package arq.padroes;

import java.util.List;

public class SomadorAdaptee implements SomadorExistente{

	public int somaLista(List<Integer> lista){
		int sum = 0;
		for (Integer valor : lista) {
			sum += valor;
		}
		
		return sum;
	}
	
}
