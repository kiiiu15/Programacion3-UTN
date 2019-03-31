package paquete;

public class Ej3 {
	private int numero;
	private static int primosEncontrados;
	private static int primosDeseados;
	private int arregloDePrimos []; 
	//getter & setters 
	
	private void setPrimosDeseados (int aEncontrar) {
		primosDeseados=aEncontrar;
	}
	private void setPrimosEncontrados (int encontrados) {
		 primosEncontrados=encontrados;
	}
	private int getPrimosEncontratdos() {
		return primosEncontrados;
	}
	
	private int getPrimosDeseados() {
		return primosDeseados;
	}
	
	private void setArregloDePrimos () {
		arregloDePrimos=new int [getPrimosDeseados()];
	}
	
	public int [] getArregloDePrimos () {
		return arregloDePrimos;
	}
	
	//constructor
	
	public Ej3 () {
		setPrimosEncontrados(0);
		setPrimosDeseados(0);
		setArregloDePrimos();
	}
	
	public Ej3 (int buscados) {
		setPrimosDeseados(buscados);
		setPrimosEncontrados(0);
		setArregloDePrimos();
	}
	 
	 
}
