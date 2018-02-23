package arq.padroes;

public class main {

	public static void main(String[] args) {
		Integer [] valores = new Integer[2];
		valores[0] = 2;
		valores[1] = 1244;
		
		SomadorAdapter2 somador1 = new SomadorAdapter2();
		System.out.println(somador1.SomarArray(valores));
		
		SomadorAdapter1 somador2 = new SomadorAdapter1();
		System.out.println(somador2.SomarArray(valores));

	}

}
