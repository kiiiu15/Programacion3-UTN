package paquete;

public class Ej14 {
	private int numero;
//getter & setters 
	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}
	
	//constructor
	
	public Ej14 () {
		setNumero(0);
	}
	
	//metodos
	
	private int getDobleNumero () {
		return getNumero()*2;
	}
	
	private int getTripleNumero () {
		return getNumero()*3;
	}
	 
	public void insertFunctionNameHere () {
		InAndOut.mostrarMensaje("Ingrese un numero: ");
		setNumero(InAndOut.pedirEntero());
		InAndOut.mostrarMensaje("su doble es : "+ getDobleNumero()+ " y su triple es : "+ getTripleNumero());
	}
}
