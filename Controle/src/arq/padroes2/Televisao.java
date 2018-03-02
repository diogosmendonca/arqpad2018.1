package arq.padroes2;

public class Televisao {
	
	private void ligar(){
		
		System.out.println("ligando");
	}
	
	private void desligar(){
		
		System.out.println("desligando");
	}
	
	private void avancarCanal(){
		
		System.out.println("Proximo canal");
	}

	private void voltarCanal(){
	
		System.out.println("Canal anterior");
	} 
	
	public void executar(String codigo){
		switch(codigo){
		case "1":
			this.ligar();
		}
	}
}
