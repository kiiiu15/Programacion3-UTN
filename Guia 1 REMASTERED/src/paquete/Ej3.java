package paquete;

public class Ej3 {
	
	private int numero;
	private int primosEncontrados;
	private  int primosDeseados;
	private int arregloDePrimos []; 
	//getter & setters 
	
	private void setPrimosDeseados (int aEncontrar) {           ///son getter & seytter hace fakta explicarlo?
		primosDeseados=aEncontrar;
	}
	private void setPrimosEncontrados (int encontrados) {
		 primosEncontrados=encontrados;
	}
	private int getPrimosEncontrados() {
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
	
	private void setNumero(int numeroPasado) {
		if (numeroPasado>2) {
			numero=numeroPasado;
		}  else {
			numero=2;
		}
	}
	
	private int getNumero() {
		return numero;
	}
	
	
	//constructor
	
	public Ej3 () {												//constructor vacio  sin sabes no teng=emos qeu buscar ningun primo y  todavia no encontramos ninmguna asique
		setPrimosEncontrados(0);
		setPrimosDeseados(0);
		setArregloDePrimos();  									// el arreglo no tendrqa lugar pero nio  nos importa asi no escpa espacio al pepe
	}
	
	public Ej3 (int buscadosPorDefecto) {
		setPrimosDeseados(buscadosPorDefecto);                  //lo mismo pewro esta vez ya sabemos cuantos queremos buscar y el arreglo va aser del tamao justo
		setPrimosEncontrados(0);
		setArregloDePrimos();
	}
	
	// metodos 
	
	private boolean  esPrimo (int esteNumero) {
		int divisor=2;
		setNumero(esteNumero);
		boolean primo=true;
		while (divisor<getNumero() && primo) {
			if (getNumero()%divisor == 0) {
				primo=false;
			}
			divisor++;
		}
		return primo;
	}
	
	public int [] encontrarPrimos () {
		setNumero(2);
		setArregloDePrimos();
		while (getPrimosEncontrados() < getPrimosDeseados()) {
			if (esPrimo(getNumero())) {
				getArregloDePrimos()[getPrimosEncontrados()]=getNumero();
				setPrimosEncontrados(getPrimosEncontrados()+1);
			}
			setNumero(getNumero()+1);
		}
		
		return getArregloDePrimos();
	}
	 
	
	public int [] encontrarPrimos (int buscados) {
		setNumero(2);
		setPrimosDeseados(buscados);
		setArregloDePrimos();
		while (getPrimosEncontrados() < getPrimosDeseados()) {
			if (esPrimo(getNumero())) {
				getArregloDePrimos()[getPrimosEncontrados()]=getNumero();
				setPrimosEncontrados(getPrimosEncontrados()+1);
			}
			setNumero(getNumero()+1);
		}
		
		return getArregloDePrimos();
	}
	
	public int [] encontrarPrimos (int buscados, int aPartirDeEsteNumero) {
		setPrimosDeseados(buscados);
		setNumero(aPartirDeEsteNumero);
		setArregloDePrimos();
		while (getPrimosEncontrados() < getPrimosDeseados()) {
			if (esPrimo(getNumero())) {
				getArregloDePrimos()[getPrimosEncontrados()]=getNumero();
				setPrimosEncontrados(getPrimosEncontrados()+1);
			}
			setNumero(getNumero()+1);
		}
		
		return getArregloDePrimos();
	}
}
