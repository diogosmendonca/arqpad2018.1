package arq.padroes2;

public class Controle {
	
	private Receptor r;
	
	public Controle(Receptor r){
		this.r = r;
	}
	
	public void ligar(){
		r.invocarComando("1");
	}
	
	public void desligar(){
		r.invocarComando("2");
	}
	
	
}
