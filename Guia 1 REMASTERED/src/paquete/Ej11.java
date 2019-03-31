package paquete;

public class Ej11 {
	private int numero1;
	private int numero2;
	
	//getter & setters
	private int getNumero1() {
		return numero1;
	}
	private void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	private int getNumero2() {
		return numero2;
	}
	private void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	// contructor 
	
	public Ej11 () {
		setNumero1(0);
		setNumero2(0);
	}
	
	//metodos 
	
	public int multiplicar (int esteNumero, int porEste) {
		setNumero1(esteNumero);
		setNumero2(porEste);
		return getNumero1()*getNumero2();
	}
	
	
	
}
