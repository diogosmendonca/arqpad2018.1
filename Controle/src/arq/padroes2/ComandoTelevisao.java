package arq.padroes2;

public class ComandoTelevisao implements Comando{
	private Televisao tv = new Televisao();
	@Override
	public void executar(String codigo) {
		tv.executar(codigo);
	}
	
}
