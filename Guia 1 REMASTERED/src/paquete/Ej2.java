package paquete;

public class Ej2 {
	private int numero;
	/// setter & getters 
	
	private void setNumero(int numeroRecibido) {
		numero=numeroRecibido;
	}
	private  int getNumero() {
		return numero;
	}
	//Constructores..
	public Ej2 () {
		setNumero(0); 
	}
	
	public Ej2 (int numero) {
		setNumero(numero); 
	}
	///Metodos...
	public boolean esPar (int numeroRecibido) {
		setNumero(numeroRecibido);
		return getNumero()%2 == 0 ? true : false;
		
	}
	
	protected boolean esPar () {
		return getNumero()%2 == 0 ? true : false;
		
	}
}
